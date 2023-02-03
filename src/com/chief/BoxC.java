package com.chief;

public class BoxC {

    double width;
    double length;
    double height;

    BoxC(double w,double l,double h){
        width=w;
        length=l;
        height=h;
    }
    double volume(){
        return width*length*height;
    }
}

class BoxMain{
    public static void main(String args[]){
        BoxC box1= new BoxC(20,10,12);
        BoxC box2= new BoxC(12,13,10);



        System.out.println("volume is: "+box1.volume());
        System.out.println("volume is: "+box2.volume());



    }
}

