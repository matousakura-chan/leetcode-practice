package com.chen.SwordForOffer.OneSix;

public class Solution {

    boolean isNegative = false;

    public double myPow(double x, int n) {

        long num = n;

        if(num<0){
            isNegative = true;
            num = -num;
        }
        return isNegative?1/divideAndConquerPow(x,num):divideAndConquerPow(x,num);
    }
    private double divideAndConquerPow(double x, long n){

        if (n == 0) return 1;
        if (n == 1) return x;

        double res = divideAndConquerPow(x,n/2);

        if(n%2 == 1) return res*res*x;
        else return res*res;
    }
}
