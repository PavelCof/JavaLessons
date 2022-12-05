package Lessons.Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedThreadstoObject {

    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}


class Worker{
    Random random = new Random();
    Object lock1 =new Object();
    Object lock2 = new Object();

    private List<Integer> list1 =new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public  void addToList1() {
        synchronized(lock1){  //синхронизация на объекте для распределения потоков  потоки работают паралельно с методами
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));

        }

    }
    public  void addToList2(){
        synchronized(lock2){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }


    }
    public void work()  {
        for (int i = 0; i < 100; i++) {
            addToList1();
            addToList2();
        }
    }
    public void workThreads(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  void main()  {
        long befor = System.currentTimeMillis();

        workThreads();

        long after = System.currentTimeMillis();
        System.out.println("Время работы программы "+(after - befor)+" милисекунд");

        System.out.println("List1 :"+ list1.size());
        System.out.println("List2 :"+ list1.size());
    }
}