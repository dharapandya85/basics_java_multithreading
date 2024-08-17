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

           return 42;
       });
       Integer i=null;
       try {
           i = future.get(1,TimeUnit.SECONDS);
           System.out.println(future.isDone());
           System.out.println(i);
       }catch(TimeoutException| InterruptedException |ExecutionException e) {
           System.out.println("Exception occurred: "+e);

       }
       executorService.shutdown();

   }
    }
