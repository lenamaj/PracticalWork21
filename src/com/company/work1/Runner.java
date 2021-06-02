package com.company.work1;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner1.nextInt();
        System.out.println(MyCalculate.calcPi(num));

    }
}
