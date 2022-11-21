package Lessons.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> linkedList=new LinkedList<>();

// методы
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.remove(1);
//        System.out.println(linkedList);
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.size());

        List<Integer> arrayList=new ArrayList<>();

//сравнение
        measureTime(arrayList);
        measureTime(linkedList);

    }
    private static void measureTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
           // list.add(i);
            list.add(0,i);//добавление элемента в начале массива
        }
        long end = System.currentTimeMillis();
        System.out.println("Скорость записи");
        System.out.println(end - start);

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {

              list.get(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Скорость чтения");
        System.out.println(end1 - start1);



    }

}
