package Lessons.Threads;

import java.util.Scanner;

public class MyThaedaVolatile {
    public static void main(String[] args) {
        MyThreades myThreades = new MyThreades();
        myThreades.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThreades.shutdown();

    }
}
  class  MyThreades extends Thread{
    private volatile boolean running=true;  // volatile синхронизирует потоки
      @Override
      public void run() {
          while (running)  {
              System.out.println("Hello");

              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      }

      public void shutdown(){
          this.running=false;
      }
  }