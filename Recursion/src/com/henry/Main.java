package com.henry;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here\
//    Game.towerOfHanoi(4,'A','C','B');
        System.out.println(product(2,5));

    }
    public static void Main(){
        Bar();
        System.out.println("I am in Main");
    }
    public static void Bar(){
        DoWork();
        System.out.println("I am in Bar");
    }
    public static void DoWork(){
        DoMore();
        System.out.println("I am in DoWork");
    }
    public static void DoMore(){
        System.out.println("I am in DOMore");
    }
    public static void foo(int n){
        if (n<1){
            return;
        }else{

            foo(n-1);
            System.out.println("This is foo(" + n + ")" );
        }
    }
    public static int Fatorial(int n){
        if(n<0){
            System.out.println("number can not be negative");
            return 0;
        }
        if(n == 0){//base case
            return 1;
        }else{
            return n * Fatorial(n-1);
        }

    }
    public static int Fibonacci(int n){
        if(n<1){
            System.out.println("not valid number");
            return 0;
        }
        if(n==1 || n == 2){
            return n-1;
        }
        else{
            return Fibonacci(n-2) + Fibonacci(n-1);
        }
    }
    public static int fun1(int x,int y){//return (1+2+3+...+x)+y
        if(x == 0){
            return y;
        }
        return fun1(x-1,x+y);

    }
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int fun2(int n){//calculate log2(n)
        if(n==1){
            return 0;
        }
        return 1 + fun2(n/2);
    }
    public static void fun3(int n){//binary of n
        if(n==0){
            return;
        }
        fun3(n/2);
        System.out.print(n%2);
    }
    public static int product(int x,int y){//product of two number
        if(x<y)
            return product(y,x);
        else if(y!=0)
            return product(x,y-1) + x;
        else
            return 0;
    }

}
