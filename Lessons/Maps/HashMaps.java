package Lessons.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>(); // порядок при выподе может измениться
        Map<Integer,String> linkedHashMap =new LinkedHashMap<>();// при выводе порядок сохранится
        Map<Integer,String> treeMap =new TreeMap<>();// при выводе сортируются по ключу


        System.out.println(" ");
        System.out.println("HashMap");
        testMap(map);
        System.out.println(" ");
        System.out.println("LinkedHashMap");
        testMap(linkedHashMap);
        System.out.println(" ");
        System.out.println("TreeMap");
        testMap(treeMap);

    }
    public static void  testMap(Map<Integer, String> map){
        map.put(35,"Фёдор");
        map.put(305,"Остап");
        map.put(355,"Эполит");
        map.put(351,"Иван");
        map.put(3051,"Эбрагим");
        map.put(3551,"Илона");

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" :  "+entry.getValue());
        }
    }
}
