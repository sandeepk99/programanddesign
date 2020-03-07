package com.program.mutithread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerUsingQueue {

    Queue<String> queue = null;
    int capacity;

    ReentrantLock lock = new ReentrantLock(true);
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();

    public ProducerConsumerUsingQueue(int size) {
        this.queue = new LinkedList<String>();
        this.capacity = size;
    }

    public void addItem(String name) throws InterruptedException {
        lock.lock();

        try{
            while(queue.size()==capacity){
                //block the thread
                notFull.await();
            }
            queue.add(name);
            notEmpty.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String takeItem() throws InterruptedException {
        lock.lock();
        try{
            while(queue.size()==0){
                //block the thread..
                notEmpty.await();
            }
            String name =  queue.remove();
            notFull.signalAll();
            return name;
        }finally {
            lock.unlock();
        }
    }
}
