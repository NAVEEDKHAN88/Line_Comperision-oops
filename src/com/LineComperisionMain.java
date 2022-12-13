package com;

import java.util.Scanner;

public class LineComperisionMain {

    public static double calLength(double x1,double y1,double x2,double y2)
    {
            double length =Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1*(y2-y1))));
              return length;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 =sn.nextDouble();
        System.out.println("Enter y1");
        double y1 = sn.nextDouble();
        System.out.println("Enter x2");
        double x2 =sn.nextDouble();
        System.out.println("Enter y2");
        double y2 = sn.nextDouble();

        double length = calLength(x1,y1,x2,y2);
        System.out.println("Length of the Line is :"+length);
    }
}
