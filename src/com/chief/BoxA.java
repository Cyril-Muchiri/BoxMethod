package com.chief;

public class BoxA {
    double width;
    double length;
    double height;

    BoxA(){
        System.out.println("constructing a box");
        width=10;
        length=10;
        height=10;


    }

    double volume(){
        return width*height*length;
    }

}
class main{
    public static void main(String args[]){
        BoxA box1=new BoxA();
        BoxA box2=new BoxA();

        System.out.println("volume of first box is: "+box1.volume());
        System.out.println("volume of second box is: "+box2.volume());



    }
}
