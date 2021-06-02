package com.company.work1;

public class MyCalculate {

   public static double calcPi(int n){

         double pi = 0;
         int j=1;
         //int k=0;
         for (int i = 0, k=0; i < n; i++,k+=2 ){

             pi += (4.0/(1.0+k))*j;
             j= j*(-1);
             //k=k+2;
         }
         return pi;
    }
}
