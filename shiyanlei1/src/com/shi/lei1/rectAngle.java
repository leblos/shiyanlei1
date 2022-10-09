package com.shi.lei1;

public class rectAngle {

    private int chang,kuang;

    public rectAngle(int chang, int kuang) {
        this.chang = chang;
        this.kuang = kuang;
    }

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public int getKuang() {
        return kuang;
    }

    public void setKuang(int kuang) {
        this.kuang = kuang;
    }

    public int calLength(){
        return 2*(chang+kuang);
    }

    public int calArea(){
        return chang*kuang;
    }



}
