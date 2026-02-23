package ava_5.ava_5_1;

public class Lamp {
    private String style;
    private Boolean battery;
    private Integer globRating;

    public Lamp(String style, Boolean battery, Integer globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp Turned on");
    }

    public String getStyle() {
        return style;
    }

    public Boolean isBattery() {
        return battery;
    }

    public Integer getGlobRating() {
        return globRating;
    }
}