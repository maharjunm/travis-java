package com.tw.travis;
public class GCDFinder {

    public int gcd(int number1, int number2) {
        if(number1 >= number2){
            if(number1 % number2 == 0){
                return number2;
            }
            System.out.println(number2);
            return gcd(number2, number1 % number2);
        }
        return gcd(number2, number1);
    }
}
