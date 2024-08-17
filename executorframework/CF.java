package com.engineeringdigest.corejava.executorframework;

import java.util.concurrent.*;

public class CF {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Executor executor= Executors.newFixedThreadPool(2);
         CompletableFuture<String> f1 =CompletableFuture.supplyAsync(()-> {
                     try {
                         Thread.sleep(5000);
                         System.out.println("Worker");
                     } catch (Exception e) {

                     }
                     return "ok";
                 },executor).orTimeout(1, TimeUnit.SECONDS).exceptionally(s ->"Timeout occurred");
         System.out.println(f1.get());
//                 }).thenApply(x->x+x);
//         System.out.println(f1.get());
//            }).get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            CompletableFuture<String> f2 =CompletableFuture.supplyAsync(()->{
//                try{
//                    Thread.sleep(5000);
//                    System.out.println("Worker");
//                } catch (Exception e) {
//
//                }
//                return "ok";
//            }).get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        CompletableFuture<Void> f=CompletableFuture.allOf(f1,f2);
//        f.join();
//      //  f.get();
//        System.out.println("Main");
//        String s= null;
//        s= completableFuture.getNow("nooo");
////        try {
////            s = completableFuture.get();
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        } catch (ExecutionException e) {
////            throw new RuntimeException(e);
////        }
//        System.out.println(s);
    //  System.out.println("Main");
    }
}
