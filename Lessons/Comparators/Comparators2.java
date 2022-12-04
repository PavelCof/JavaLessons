package Lessons.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1,"test"));
        people.add(new Person(17,"test2"));
        people.add(new Person(12,"test3"));
        people.add(new Person(155,"test55"));
        people.add(new Person(11,"test11"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                }else if(o1.getId() < o2.getId()) {
                    return -1;
                }else{
                    return 0;
                }

            }
        });
        System.out.println(people);
    }
}
class Person {
    public int getId() {
        return id;
    }

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}