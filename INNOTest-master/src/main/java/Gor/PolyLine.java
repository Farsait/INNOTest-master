package Gor;

import java.util.Arrays;

public class PolyLine {
    Point[]points;
    public PolyLine(Point... points){
        this.points=points;
    }
    public Line[] tolineArray(){
        Line[]arr=new Line[points.length-1];
        for (int i=1; i< points.length; i++){
            arr[i-1]=new Line(points[i-1],points[i]);
        }
        return arr;
    }
      public double lenght(){
          double sum=0, len1, len2;
          for (int i=0; i< points.length - 1;i++){
              len1=points[i].x-points[i+1].x;
              len2=points[i].y-points[i+1].y;
              sum+=Math.sqrt(len1*len1+len2*len2);
          }
          return sum;
    }
    public String toString(){

        return "Line{" + Arrays.toString(points) + '}';
    }

}
