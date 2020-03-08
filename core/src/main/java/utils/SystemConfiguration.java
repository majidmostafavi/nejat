package utils;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by majid on 5/23/17.
 */
@SuppressWarnings("UnusedDeclaration")
@Named("config")
@ApplicationScoped
public class SystemConfiguration implements FileSystemConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(SystemConfiguration.class);

    private volatile static Properties configProperties;

    /**
     * Getter for property 'properties'.
     *
     * @return Value for property 'properties'.
     */
    public synchronized static Properties getProperties() {

        if (configProperties == null) {
            configProperties = new Properties();
            try {
                configProperties.load(SystemConfiguration.class.getResourceAsStream("/nejat2.properties"));
            } catch (IOException ex) {
                logger.error("Could not load configuration properties. " +
                        "This will lead to serious runtime problems.", ex);
                throw new RuntimeException(ex);
            }

        }

        return configProperties;
    }

    @Produces
    @Any
    @Config
    public String getConfiguration(InjectionPoint p) {
        Properties config = getProperties();

        String key = "";
        try {
            key = p.getAnnotated().getAnnotation(Config.class).value();
        } catch (RuntimeException e) {
            //Do nothing. No Key
        }
        logger.trace("Initial Key : " + key);

        if (key.isEmpty()) {
            key = p.getMember().getDeclaringClass().getName() + "." + p.getMember().getName();

            if (config.getProperty(key) == null) {
                key = p.getMember().getDeclaringClass().getSimpleName() + "." + p.getMember().getName();
                if (config.getProperty(key) == null) {
                    key = p.getMember().getName();
                }
            }
        }
        logger.trace("Final Key : " + key);

        String property = config.getProperty(key);
        logger.trace("Value : " + property);
        return property;
    }

    @Produces
    @Any
    @Config
    public Boolean getConfigurationBoolean(InjectionPoint p) {
        String value = getConfiguration(p);
        return "true".equalsIgnoreCase(value);
    }

    @Produces
    @Any
    @Config
    public String[] getConfigurationArray(InjectionPoint p) {
        String val = getConfiguration(p);
        return (val == null || val.trim().isEmpty()) ? new String[0] : val.split(",");
    }

    @Produces
    @Any
    @Config
    public Double getConfigurationDouble(InjectionPoint p) {
        String val = getConfiguration(p);
        return Double.parseDouble(val);
    }

    @Produces
    @Any
    @Config
    public Integer getConfigurationInteger(InjectionPoint p) {
        String val = getConfiguration(p);
        return Integer.parseInt(val);
    }

    @Produces
    @Any
    @Config
    public Long getConfigurationLong(InjectionPoint p) {
        String val = getConfiguration(p);
        return Long.parseLong(val);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConfiguration(@NotNull String key) {
        return getProperties().getProperty(key);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double getConfigurationDouble(String key) {
        String stringConfig = getConfiguration(key);
        Double doubleConfig = 0D;
        if (stringConfig != null) {
            try {
                doubleConfig = Double.valueOf(stringConfig);
            } catch (NumberFormatException e) {
                throw new IllegalStateException("Config key : " + key + " does not specify a double.", e);
            }
        }
        return doubleConfig;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getConfigurationArray(String key) {
        String[] parts = null;
        String configurationKey = getConfiguration(key);
        if (configurationKey == null || configurationKey.isEmpty()) {
            return new String[0];
        } else {
            for (int i = 0; i < configurationKey.length(); i++) {
                parts = configurationKey.split(",");
            }
            return parts;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean getConfigurationBoolean(String key) {
        return "true".equalsIgnoreCase(getConfiguration(key));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConfigurationString(@NotNull String key) {
        return getProperties().getProperty(key);
    }
}
