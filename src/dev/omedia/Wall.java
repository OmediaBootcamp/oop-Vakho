package dev.omedia;

public class Wall {
    private double width;
    private double height;

    public Wall(){}

    public Wall(double width, double height){
        if(width < 0){
            width = 0;
        }else{
            this.width = width;
        }this.width = width;
        if(height < 0){
            height = 0;
        }else{
            this.height = height;
        }


    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

}