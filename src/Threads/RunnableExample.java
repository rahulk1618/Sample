package Threads;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        //System.out.println("Runnable thread: " +Thread.currentThread());
        for (int i = 0; i <=5; i++) {
            //System.out.println("Thread name: " + Thread.currentThread());
            System.out.println(i);

            try {
                Thread.sleep(100);

            } catch (InterruptedException e){

            }
        }
    }
        public static void main(String[] args){
        RunnableExample obj= new RunnableExample();
        Thread t1 = new Thread(obj,"rahul");
        t1.start();
        Thread t2 = new Thread(obj,"ravi");
        Thread t3 = new Thread(obj,"suresh");
        t1.yield();

        try {
            t1.join();
        }
        catch (InterruptedException e){
            System.out.println("Exception");
        }
        try {
            t1.start();
        } catch (IllegalThreadStateException e){
            System.err.println("fuck off Thread 1 already started ");

        }


        t2.start();
            try {
                t2.join();
            }
            catch (InterruptedException e){
                System.out.println("Exception");
            }

           t3.start();
        }
    }

