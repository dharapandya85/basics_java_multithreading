package com.engineeringdigest.corejava;

 class MyThread extends Thread{
     public MyThread(String name){
         super(name);
     }
     @Override
     public void run() {
        //System.out.println("Thread is running");
         for(int i=0;i<5;i++){
             System.out.println(Thread.currentThread().getName() +" is running");
             Thread.yield();
         }

     }
     public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("t1");
         MyThread t2 = new MyThread("t2");
        t1.start();
        t2.start();
        //t1.interrupt();
         //t1.join();
        // System.out.println("Hello");
 }
}
// start run sleep join setPriority interrupt yield setDaemon