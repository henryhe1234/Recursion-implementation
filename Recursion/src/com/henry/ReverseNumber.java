package com.henry;

public class ReverseNumber {
    private static int position = 1;
    private static int revNumber = 0;
    public static int Reverse(int n){
        if(n==0){
            return n;
        }
        Reverse(n/10);
        revNumber += (n%10)*position;
        position *= 10;
        return revNumber;
    }
}
