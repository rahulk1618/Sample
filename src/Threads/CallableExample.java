package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable {


    @Override
    public String call() throws Exception {
        for (int i=0; i<=4; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){

            }

        }
        return "Hey MAMA";
    }
    public static void main(String[] args){
        CallableExample call = new CallableExample();
        FutureTask task = new FutureTask(call);
        Thread t1 = new Thread(task);
        t1.start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
