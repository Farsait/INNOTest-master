package ru.courses.INNO.geometry;

import ru.courses.interfaceGeometry.iLines;

public class Line {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line(int x1,int y1, int x2, int y2) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }
    public double getLength(){
        double res=0;
        res =  Math.sqrt((this.p2.x-this.p1.x)*(this.p2.x-this.p1.x)+(this.p2.y-this.p1.y)*(this.p2.y-this.p1.y));
        return res;
    }
    public String toString(){
        return "{"+p1+";"+p2+"}";
    }
}
