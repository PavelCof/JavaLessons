package Lessons.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<>();
        for(int i=0;i<33; i++){
            arrayList.add(i);
        }
        //методы обхода
        for(int i=0;i<arrayList.size(); i++){
            System.out.println(i);
        }
        for (Integer x:arrayList) {
            System.out.println(x);
        }

        System.out.println(arrayList);
        arrayList.remove(31);
        System.out.println(arrayList);
        System.out.println(arrayList.get(31));
        System.out.println(arrayList.size());

        List<Integer> list =new ArrayList<>();// таким образом можно сменить на LinkedList
        for(int i=0;i<33; i++){
            arrayList.add(i);
        }
        list = new LinkedList<>();/// для ускорения работы лучше использовать LinkedList
        arrayList.remove(31);

    }


}
