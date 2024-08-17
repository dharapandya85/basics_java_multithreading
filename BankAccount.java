package com.engineeringdigest.corejava;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.locks.Lock;

public class BankAccount {
    private int balance=100;

    private final Lock lock=new ReentrantLock();
    public  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+ " attempting to Withdraw" + amount );
        try {
            lock.lock();
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try{
                    System.out.println(Thread.currentThread().getName() + " proceeding with  withdrawal");
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed  withdrawal.Remaining balance: " + balance);
                }catch(Exception e) {
                    Thread.currentThread().interrupt();
                    }finally{
                        lock.unlock();
                    }

            }else{
                    System.out.println(Thread.currentThread().getName()+ " insufficient balance" );
                }
            }else{
                System.out.println(Thread.currentThread().getName()+ " could not acquire lock,will try again later" );
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted()) {
            System.out.println( " ");
        }

    }
}
