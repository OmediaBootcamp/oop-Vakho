package dev.omedia;

public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }


    public double distance(int x, int y) {

        int xCoordinate = this.x - x;
        int yCoordinate = this.y - y;
        return Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);
    }

    public double distance(Point a) {
        return distance(a.x, a.y);
    }

    public double distance() {
        return distance(0, 0);
    }

}