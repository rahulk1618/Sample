package Threads;

public class PrintTable {
    static synchronized void printTable(int n){
        for (int i = 0; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
