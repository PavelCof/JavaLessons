package Lessons.Iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterables {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);

        Iterator<Integer> integerIterator = list.iterator();

        while ( integerIterator.hasNext()){ // можно удалить элемент в процессе
            if(integerIterator.next()==5){
                integerIterator.remove();
            }

          //  System.out.println(integerIterator.next());
        }

        System.out.println("-----");

        for(int x:list) // нельзя удалить элемент
            System.out.println(x);
    }

}
