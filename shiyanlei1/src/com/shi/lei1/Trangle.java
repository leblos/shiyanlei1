package com.shi.lei1;

public class Trangle {
    double b1;
    double b2;
    double b3;

    public Trangle(double b1, double b2, double b3) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    private void is_Trangle(){
        if (b1+b2>b3 && b1+b3>b2 && b2+b3>b1 ){
            System.out.println("能够构成三角形");
        }else{
            System.out.println("不能够构成三角形");
            return;
        }

        if (b1==b2||b1==b3||b2==b3){
            System.out.println("该三角形为等腰三角形");
        }else{
            System.out.println("该三角形为普通三角形");
        }

    }

    public void a(){
        is_Trangle();
    }




}
