package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b= 0;
        double x1, x2,x3;
        char i = 'i' ;
        System.out.println("Введите a:");
        a = scanner.nextDouble();

        System.out.println("Введите b:");
        b = scanner.nextDouble();

        System.out.println("x1 = 0");
        System.out.println("x2 = -"+(Math.sqrt(( b/a))) + i) ;
        System.out.println("x3=  " +(Math.sqrt((b/a)))+ i );



    }
}
