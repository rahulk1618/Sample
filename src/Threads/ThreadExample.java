package Threads;

public class ThreadExample extends Thread {
    @Override
   public void run() {
        for (int i =0;i<=3;i++){
            System.out.println("Thread name: "+Thread.currentThread());
            System.out.println(i);
        }
    }

    public static void main(String[] args){

        System.out.println("inside main thread: " + Thread.currentThread());
        ThreadExample t1 = new ThreadExample();
        t1.start();
        t1.setPriority(1);
        t1.run();
        ThreadExample t2 =new ThreadExample();
        t2.start();
        t2.setName("rahul");
        //t2.setPriority(Thread.MAX_PRIORITY);
    }
}
