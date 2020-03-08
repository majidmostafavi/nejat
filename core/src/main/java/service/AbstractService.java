package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by majid on 8/15/16.
 */
public abstract class AbstractService implements Serializable {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

}
