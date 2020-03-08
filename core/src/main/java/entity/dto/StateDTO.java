package entity.dto;

public class StateDTO {

    private String key;
    private String name;
    private Long count;
    private String color;

    public StateDTO(String key, String name, Long count, String color) {
        this.key = key;
        this.name = name;
        this.count = count;
        this.color = color;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
