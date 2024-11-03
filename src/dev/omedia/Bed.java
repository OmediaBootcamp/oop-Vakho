package dev.omedia;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt){
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("The lamp is turned on");
    }

    public String getStyle(){
        return style;
    }

    public int pillows(){
        return pillows;
    }

    public int getHeight(){
        return height;
    }

    public int getSheets(){
        return sheets;
    }

    public int getQuilt(){
        return quilt;
    }
}
