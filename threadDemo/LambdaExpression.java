package com.engineeringdigest.corejava.threadDemo;

public class LambdaExpression {
    public static void main(String[] args) {
      //  Runnable task1 = () -> System.out.println("Hello ");
        Thread t1=new Thread(() ->{
           for(int i=0;i<1;i++){
               System.out.println("Hello world");
           }
        });
//        int a =1;
//        Runnable task=()->{
//            for(int i=0;i<1;i++){
//                System.out.println("Hello world");
//            }
//        };
        t1.start();
    }
}
