package Lessons.Comparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InterCorparables {
    public static void main(String[] args) {
        List<Persons> peopleList = new ArrayList<>();
        Set<Persons> personSet = new TreeSet<>();

        addElements(peopleList);
        addElements(personSet);

        Collections.sort(peopleList);  //отсортирует с помощью compareTo

        System.out.println(peopleList);
        System.out.println(personSet);
    }
    private static void addElements(Collection collection){
        collection.add( new Persons(3,"jdsfkjshdfsf"));
        collection.add( new Persons(1,"jdsfkjshf"));

    }


}
class Persons implements Comparable<Persons>{
    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persons persons = (Persons) o;

        if (id != persons.id) return false;
        return name != null ? name.equals(persons.name) : persons.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Persons o) {   ///сортировка по умолчанию
        if(this.name.length() > o.getId()){
            return -1;
        }else if(this.name.length() < o.getId()){
            return 1;
        }else {
            return 0;
        }
    }
}