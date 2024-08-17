package com.engineeringdigest.corejava;

public class Counter {
    private int count=0;
    public synchronized void increment(){
        //synchronized(this){
          //  count++;
        //}
        count++;
    }
    public int getCount(){
        return count;
    }
}
