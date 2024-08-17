package com.engineeringdigest.corejava.executorframework;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
   public static void main(String[] args) {
       ExecutorService executorService = Executors.newSingleThreadExecutor();
       Future<Integer> future=executorService.submit(()->{
           try{
               Thread.sleep(2000);
           } catch(InterruptedException e) {
               System.out.println("Exception occurred:" + e);
           }
            System.out.println("Hello");
           return 42;
       });
       try{
           Thread.sleep(1000);
       } catch(InterruptedException e) {
           System.out.println("Exception occurred:" + e);
       }
       future.cancel(false);
       System.out.println(future.isCancelled());
       System.out.println(future.isDone());
       executorService.shutdown();

   }
    }
