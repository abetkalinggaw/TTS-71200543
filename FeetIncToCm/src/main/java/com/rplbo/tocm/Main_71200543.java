package com.rplbo.tocm;

public class Main_71200543 {
    public Main_71200543() {
    }

    public static double FeetIncToCm(double feet, double inch) {
        if (feet > 0.0 && inch > 0.0) {
            inch = (inch + feet * 12.0) * 2.54;
            System.out.println("Nilai dalam centimeter: " + inch + " cm");
            return inch;
        } else {
            return -1.0;
        }
    }

    public static double FeetIncToCm(int inch) {
        if (inch > 0) {
            double a = (double)(inch / 12);
            double b = (double)(inch % 12);
            System.out.println(inch + " inc = " + a + " feet " + b + " inc");
            return FeetIncToCm(a, b);
        } else {
            return -1.0;
        }
    }

    public static void main(String[] args) {
        FeetIncToCm(12.0 , 5.0);
        FeetIncToCm(30);
    }
}

