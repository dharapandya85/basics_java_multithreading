package com.engineeringdigest.corejava.executorframework;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices=3;
        ExecutorService executorService=Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier  barrier=new CyclicBarrier(numberOfServices);
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
//        for(int i=0;i<numberOfServices;i++) {
//            new Thread(new DependentService(latch).start());
//        }
       // latch.await(5,TimeUnit.SECONDS);
        //latch.await();

       // System.out.println("Main");
       // latch.await(5,TimeUnit.SECONDS);
        System.out.println("Main");
      executorService.shutdown();
//        Future<String> future1 =executorService.submit(new DependentService());
//        Future<String> future2=executorService.submit(new DependentService());
//        Future<String> future3=executorService.submit(new DependentService());
//
//        future1.get();
//        future2.get();
//        future3.get();
//        System.out.println("All dependent services finished. Starting main service...");
//        executorService.shutdown();
    }
}
class DependentService implements Callable<String> {
    private final CyclicBarrier barrier;
    public DependentService(CyclicBarrier barrier) {
        this.barrier= barrier;
    }
    @Override
    public String call() throws Exception {
       // try {
           // System.out.println(Thread.currentThread().getName() + " service started. ");
            //Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " service started. ");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier. ");
            barrier.await();
      //  } finally
     //    {
           // latch.countDown();
             barrier.await();
    //    }
        return "ok";
    }
}