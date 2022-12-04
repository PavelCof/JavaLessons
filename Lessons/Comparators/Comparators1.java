package Lessons.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("jdnkj");
        animals.add("kjdc");
        animals.add("ksndljk");
        animals.add("kds");
        animals.add("a");
        animals.add("jndskjnkfnkj");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(777);
        numbers.add(0);
        numbers.add(782862376);

        Collections.sort(numbers,new IntagerComparator());
        System.out.println(numbers);


//упрощенный вариант
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2){
                    return 1;
                }else if(o1 > o2) {
                    return -1;
                }else{
                    return  0;
                }
            }
        });
        System.out.println(numbers);
    }

    public static void sort() {
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        if(o1.length()>o2.length()){
            return 1;
        }else  if(o1.length()<o2.length()) {
            return -1;
        }else{
            return  0;
        }
    }
}

class IntagerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return 1;
        }else if(o1 > o2) {
            return -1;
        }else{
            return  0;
        }
    }
}
