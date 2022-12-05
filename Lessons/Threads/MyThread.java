package Lessons.Threads;

public class MyThread {
    public static void main(String[] args) {
        MyThreads myThreads = new MyThreads();
        myThreads.start();
        System.out.println("основной поток Thread запущен");

        MyThreads myThreads2 = new MyThreads();
        myThreads2.start();

        try {
            Thread.sleep(1000);
            System.out.println("основной поток поспал 1 секунду");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThreads myThreads3 = new MyThreads();
        myThreads3.start();


        Thread  thread = new Thread(new Runner()); //еще один способ создать новый поток - класс Runnable
        thread.start();

        System.out.println("Основной поток");
    }
    public static void iter(){
        for (int i = 0; i < 100; i++) {
            System.out.println("дополнительный поток Threads "+i);
            if(i==50){
                try {
                    Thread.sleep(3000);
                    System.out.println("дополнительный поток поспал 3 секунду");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        MyThread.iter();
    }
}
class MyThreads extends Thread{
    public void run(){
        MyThread.iter();
    }
}
