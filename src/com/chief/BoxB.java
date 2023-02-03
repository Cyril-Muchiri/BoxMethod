package com.chief;

public class BoxB {
    double width;
    double height;
    double length;


    void dimensions(double w, double h, double l) {
        width = w;
        height = h;
        length = l;

    }

    double volume(){
        return width*height*length;
    }


    BoxB() {
        System.out.println("This are my boxes");
    }
}
class BoxPractice{
    public static void main(String args[]){


        BoxB box1=new BoxB();
        BoxB box2= new BoxB();

        box1.dimensions(20,10,10);
        box2.dimensions(15,11,13);



        System.out.println("Volume for 1st box is : " +box1.volume());
        System.out.println("Volume for 2nd box is : " +box2.volume());


    }

}
