package com.engineeringdigest.corejava;

 class MyThread extends Thread{
     
     @Override
     public void run() {
        //System.out.println("Thread is running");
         while (true){
             System.out.println(" Hello World");
            
         }

     }
     public static void main(String[] args) throws InterruptedException {
        MyThread myThread= new MyThread();
        myThread.setDaemon(true);
         MyThread t1= new MyThread();
        t1.start();
        myThread.start();
        System.out.println("Main done");
        
        //t1.interrupt();
         //t1.join();
        // System.out.println("Hello");
 }
}
// start run sleep join setPriority interrupt yield setDaemon
//DAEMON THREADS