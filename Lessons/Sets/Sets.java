package Lessons.Sets;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Sets {
    public static void main(String[] args) {

        setLesson2();


    }

    public static void setLesson1(){
        Set<String> hashSet =new HashSet<>(); // порядок при выподе может измениться
        Set<String> linkedHashSet =new LinkedHashSet<>();// при выводе порядок сохранится
        Set<String> treeSet =new TreeSet<>();// при выводе сортируются по ключу

        System.out.println("---");
        System.out.println("hashSet");
        testSet(hashSet);
        System.out.println("---");
        System.out.println("LinkedHashSet");
        testSet(linkedHashSet);
        System.out.println("---");
        System.out.println("TreeSet");
        testSet(treeSet);

        System.out.println("---");

        // проверка существует ли значение в массиве
        System.out.println("проверка существует ли значение в массиве");
        System.out.println( hashSet.contains("Alisa"));
        System.out.println( hashSet.contains("Fedor"));

    }
    public static void testSet(Set<String> set){
        set.add("Alina");
        set.add("Alisa");
        set.add("Alena");
        set.add("Anna");
        set.add("Aliya");
        set.add("Alisa");

        for (String name: set) {
            System.out.println(name);
        }
        System.out.println(set.size());
    }
    public static void setLesson2(){
        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(5);
        set1.add(7);
        set1.add(9);


        Set<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        // обьединение множеств в новое множество union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        //пересечение множеств intersection //в intersection будут только пересекающиеся значеня
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(intersection);


        //разность множеств difference //в difference будут удалены значения пересекшиеся со вторым множеством
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);
    }

}
