package com;

import java.util.Scanner;

/*check equality of two lines based on the end points,*/

public class LineComperisionMain {

    public  double calLength(double x1,double y1,double x2,double y2)
    {
            double length =Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
              return length;
    }

    public  int lengthEquality(double length, double length1) {
        int flag;
        Double len = new Double(length);
        Double len1 = new Double(length1);
        flag = len.compareTo(len1);
        return flag;
    }

    private static void output(int flag) {
        if (flag == 0) {
            System.out.println("Both the line are equal in size");
        } else if (flag > 0) {
            System.out.println("First line is bigger in size");
        } else {
            System.out.println("Second line is bigger in size");
        }
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

        LineComperisionMain lineComperisionMain = new LineComperisionMain();
        double length = lineComperisionMain.calLength(x1,y1,x2,y2);

        System.out.println("Enter a1");
        double a1 =sn.nextDouble();
        System.out.println("Enter b1");
        double b1 = sn.nextDouble();
        System.out.println("Enter a2");
        double a2 =sn.nextDouble();
        System.out.println("Enter b2");
        double b2 = sn.nextDouble();
        double length1 = lineComperisionMain.calLength(a1,b1,a2,b2);
        int flag =lineComperisionMain.lengthEquality(length,length1);
        output(flag);


        System.out.println("Length of first Line is  :"+length);
        System.out.println("Length of Second Line is :"+length1);
    }
}

