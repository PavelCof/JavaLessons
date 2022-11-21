package Lessons.Sets;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Sets {
    public static void main(String[] args) {
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

    }
    public static void testSet(Set<String> set){
        set.add("Alina");
        set.add("Alisa");
        set.add("Alena");
        set.add("Anna");
        set.add("Aliya");
        for (String name: set) {
            System.out.println(name);
        }
    }
}
