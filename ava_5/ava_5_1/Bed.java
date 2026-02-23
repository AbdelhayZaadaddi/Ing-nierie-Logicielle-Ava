package ava_5.ava_5_1;

public class Bed {
    private String style;
    private Integer pillows;
    private Integer height;
    private Integer sheets;
    private Integer quilt;

    public Bed(String style, Integer pillows, Integer height, Integer sheets, Integer quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public Integer getPillows() {
        return pillows;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getSheets() {
        return sheets;
    }

    public Integer getQuilt() {
        return quilt;
    }
}
