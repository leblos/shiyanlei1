package com.shi.lei1;

public class test {
    public static void main(String[] args) {
        Trangle trangle = new Trangle(2, 2, 3);
        trangle.a();

        rectAngle rectAngle = new rectAngle(2, 3);
        System.out.println("矩形的面积为："+rectAngle.calArea());
        System.out.println("矩形的周长为："+rectAngle.calLength());

    }
}
