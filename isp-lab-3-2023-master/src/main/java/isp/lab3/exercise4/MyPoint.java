package isp.lab3.exercise4;

import static java.lang.Math.sqrt;

public class MyPoint {
    private int x;
    private int y;
    private int z;
    MyPoint(){
        this(0,0,0);
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public void setXYZ(int x,int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String toString() {
        return "MyPoint{" + "(x,y,z)"+ x +'/' + y + '/'+ z+'}';
    }
    public int distance(int x,int y, int z){
        return (int) sqrt((this.x-x)^2+(this.y-y)^2+(this.z-z)^2);
    }
    public static void main(String[] args){
        MyPoint point1=new MyPoint(2,3,5);
        MyPoint another=new MyPoint();
        int d= point1.distance(1,1,1);
        System.out.println(d);


    }
}
