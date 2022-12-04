package Lessons.Queue_FirstIn_FirstOut;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FirstIn_FirstOut {
    public static void main(String[] args) {
        PersonsQueue personsQueue1 =new PersonsQueue(1);
        PersonsQueue personsQueue2 =new PersonsQueue(2);
        PersonsQueue personsQueue3 =new PersonsQueue(3);
        PersonsQueue personsQueue4 =new PersonsQueue(4);
        PersonsQueue personsQueue5 =new PersonsQueue(5);

     //   Queue<PersonsQueue> personsQueues = new LinkedList<>();
        Queue<PersonsQueue> personsQueues =new ArrayBlockingQueue<PersonsQueue>(3);// 10 - максимальная длинна очереди
//        personsQueues.add(personsQueue5);  //выбросит ошибку препереполнении
//        personsQueues.add(personsQueue1);
//        personsQueues.add(personsQueue2);
//        personsQueues.add(personsQueue4);
//        personsQueues.add(personsQueue3);

        personsQueues.offer(personsQueue5); //просто остановится при переполнении
        personsQueues.offer(personsQueue1);
        personsQueues.offer(personsQueue2);
        personsQueues.offer(personsQueue4);
        personsQueues.offer(personsQueue3);

        System.out.println(personsQueues.remove());// удаление первого оз очереди
        System.out.println(personsQueues.peek()); //посмотреть кто первый в очереди
        System.out.println(personsQueues);

        for (PersonsQueue personsQueue : personsQueues)
            System.out.println(personsQueue);
    }
}
class PersonsQueue{
    private int id;
    public PersonsQueue(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonsQueue{" +
                "id=" + id +
                '}';
    }
}