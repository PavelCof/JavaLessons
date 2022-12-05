package Lessons.Threads;

public class SynchronizedThreads {  // Synchronized синхронизация потоков при записив одну переменную
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        SynchronizedThreads synchronizedThreads = new SynchronizedThreads();
        synchronizedThreads.doWork();
    }
    public synchronized  void  increment(){  //пускает потоки по очереди
        counter++;
    }

    public  void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000;i++) {
                    increment();
                }
            }
        });
        thread1.start();
        thread2.start();
        System.out.println(counter);

            thread1.join(); //используется для ожидания завершения потока (главный поток ждет пока дополнительный поток отработает)
            thread2.join(); //используется для ожидания завершения потока (главный поток ждет пока дополнительный поток отработает)

        System.out.println(counter);

    }
}



