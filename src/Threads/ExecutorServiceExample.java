package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample implements  Runnable {
    @Override
    public void run() {
        System.out.println("inside run" +Thread.currentThread().getName());
    }
    public static void main(String[] args){
        ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
        e.schedule(new ExecutorServiceExample(),5,TimeUnit.SECONDS);
        e.shutdown();
    }
}
