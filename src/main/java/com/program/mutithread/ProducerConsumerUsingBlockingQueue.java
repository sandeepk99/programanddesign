package com.program.mutithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Information{

    private String name;

    public Information(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ProducerConsumerUsingBlockingQueue {

    public static void main(String [] args) throws InterruptedException {
        int MAX_CAPACITY = 10;
        BlockingQueue queue = new ArrayBlockingQueue(MAX_CAPACITY);

        System.out.println("No of processor --" +Runtime.getRuntime().availableProcessors());


        Runnable producer = () -> {
            try {
                System.out.println("In producer Thread ..");
                while(true){
                    queue.put(createInformation());
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            System.out.println("In Consumer Thread ..");
            try {
                while(true){
                    System.out.println("Consumer the value .."+queue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(1000);
    }

    private static String createInformation(){
        Information info = new Information("Produce .." +Math.random());
        return info.getName();
    }
}
