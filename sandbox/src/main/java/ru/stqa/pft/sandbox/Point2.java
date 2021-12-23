package ru.stqa.pft.sandbox;


public class Point2 {

    public double a;
    public double b;

    public void Coord(double x, double y){
        this.a = a;
        this.b = b;
    }

    public double distance(Point2 createPoint) {
        return Math.sqrt((createPoint.a-this.a)*(createPoint.a-this.a)+(createPoint.b-this.b)*(createPoint.b-this.b));
    }
}
