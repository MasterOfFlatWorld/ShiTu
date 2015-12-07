package com.shitu.routing;

/**
 * Created by DongliangLyu on 2015/12/3.
 */
public class Point3d {
    double x;
    double y;
    int floor;

    //默认构造函数
    public Point3d(){
        double x = 0.0;
        double y = 0.0;
        floor = 0;
    }

    //构造函数
    public Point3d(double x0, double y0, int floor0){
        x = x0;
        y = y0;
        floor = floor0;
    }

    //判断两个点是否相等
    public boolean IsEqual(Point3d pt, double distError)
    {
        double squareLength = Math.pow((x - pt.x), 2) + Math.pow((y - pt.y), 2)
                + Math.pow((floor - pt.floor) * EdgeAttribute.floorHeight, 2);
        return (squareLength < distError * distError);
    }

    public double SquareDistanceTo(Point3d pt)
    {
        return Math.pow((x - pt.x), 2) + Math.pow((y - pt.y), 2) + Math.pow((floor - pt.floor) * EdgeAttribute.floorHeight, 2);
    }

}