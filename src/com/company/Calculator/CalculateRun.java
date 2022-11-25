package com.company.Calculator;

public class CalculateRun {
    public static void add(int a, int b){
        int result = a+b;
        System.out.println(a+ " + " + b + " = " + result + "\n");
        System.out.println("Type 'Y to continue");

    }
    public static void subtract(int a, int b){
        int result = a-b;
        System.out.println(a+ " - " + b + " = " + result + "\n");

    }
    public static void multiply(int a, int b){
        int result = a*b;
        System.out.println(a+ " * " + b + " = " + result + "\n");

    }
    public static void divide(double a, double b){
        double result= a/b;
        System.out.println(a+ " / " + b + " = " + result + "\n");

    }
    public static void power(int a, int b){
        long result = 1;
        for (int i =0 ; i<b ; i++){
            result=result*a;
        }
        System.out.println(a+ " ^ " + b + " = " + result + "\n");

    }

    public static void sin(int a){
        System.out.println("sin(" + a + ") is: " + Math.sin(Math.toRadians(a)));

    }

    public static void cos(int a){
        System.out.println("cos(" + a + ") is: " + Math.cos(Math.toRadians(a)));

    }

    public static void tan(int a){
        System.out.println("tan(" + a + ") is: " + Math.tan(Math.toRadians(a)));

    }

    public static void sqrt(int a){
        System.out.println("The square root for " + a + " is: " + Math.sqrt(a));

    }

    public static void mod(int a, int b){
        System.out.println(a + "%" + b + " is: " + a%b);

    }
}
