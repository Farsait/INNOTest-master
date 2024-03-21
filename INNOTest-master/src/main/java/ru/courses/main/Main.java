package ru.courses.main;

import ru.courses.INNO.geometry.Point;
import ru.courses.INNO.geometry.PolyLine;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,5);
        Point p2 = new Point(12,8);
        Point p3 = new Point(5,3);
        Point p4 = new Point(8,9);
        System.out.println("--------------------------------------------------------------");
        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        System.out.println("p3 = "+p3);
        System.out.println("p4 = "+p4);
        System.out.println("--------------------------------------------------------------");
        ArrayList<Point> al=new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        PolyLine pl = new PolyLine(al);
        System.out.println(pl);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Массив линий : "+Arrays.toString(pl.getLines()));
        System.out.println("Длина ломаной : "+pl.getLength());
        System.out.println("--------------------------------------------------------------");

    }
}








