package com.chief;

import java.util.Scanner;

class Box {
    double width;
    double height;
    double length;

    double  volume(){
        return width*height*length;
    }
    void dim(double w,double h,double l){
        width=w;
        height=h;
        length=l;
    }
}
class BoxDemo{
    public static void main(String args[]){
        Box box1=new Box();
        Box box2=new Box();
        double vol;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter height of first box: ");
        box1.height= scanner.nextDouble();
        double a=box1.height;


        System.out.println("Enter length of first box: ");
        box1.length= scanner.nextDouble();
        double b=box1.length;

        System.out.println("Enter width of first box: ");
       box1.width= scanner.nextDouble();
        double c=box1.width;

        scanner.close();

        box1.dim(a,b,c);
        box2.dim(21,10,10);

            //vol= box1.volume();
        System.out.println("volume for first box is: "+box1.volume());

        //vol= box2.volume();
        System.out.println("volume for second box is: "+box2.volume());


    }
}




