package com.company.work4;

import com.company.work4.calcarea.Calculate;

import java.util.Scanner;


public class Runner {

    public void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a radius: ");
        double radius = scanner.nextDouble();

        System.out.println(Calculate.areaCircle(radius));


        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Input a side square: ");
        int side = scanner1.nextInt();

        System.out.println(Calculate.areaSquare(side));
    }
}
