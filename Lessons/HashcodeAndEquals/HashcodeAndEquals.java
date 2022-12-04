package Lessons.HashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashcodeAndEquals {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person =new Person(1,"Lisa");
        Person person2 =new Person(1,"Ulya");

        map.put(person,"Один");
        map.put(person,"Два");

        set.add(person);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }


}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
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
}
