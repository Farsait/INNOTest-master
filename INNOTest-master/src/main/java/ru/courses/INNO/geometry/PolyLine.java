package ru.courses.INNO.geometry;

import java.util.ArrayList;
import java.util.Arrays;

public class PolyLine {
    ArrayList<Point> pl = new ArrayList<>();

    public PolyLine(){    }

    public PolyLine(ArrayList pl){
        this.pl=pl;
    }
    public double getLength(ArrayList pl){
        return 0;
    }

    public Line[] getLines(){
        Line res[]=new Line[this.pl.size()-1];
        for (int i=0;i<(this.pl.size()-1);i++){
            res [i]= new Line(pl.get(i),pl.get(i+1));
        }
        return res;
    }
    public double getLength(){
        double res=0;
        Line l;
        for (int i=0;i<(this.pl.size()-1);i++){
            l= new Line(this.pl.get(i),this.pl.get(i+1));
            res=res+l.getLength();
        }
        return res;
    }


    public String toString(){
        return "Линия "+pl;
    }
}
