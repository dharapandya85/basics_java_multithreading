package com.engineeringdigest.corejava;

 class MyThread extends Thread{
     @Override
     public void run() {
        //System.out.println("Thread is running");
         try {
             Thread.sleep(1000);
             System.out.println( "Thread is running...");
         } catch (InterruptedException e) {
            System.out.println("Thread interrupted:"+e);
         }


     }
     public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
         //t1.join();
        // System.out.println("Hello");
 }
}
// start run sleep join setPriority interrupt yield