import java.util.*;
//import java.util.*;
import java.util.stream.Collectors;
import java.util.*;

//import javax.swing.event.swingProgramChangeSupport;
class Student {
    String name;
    int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "" + name + " " + id + " " + age;
    }
}

class Alpaha implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.age > b.age)
            return 1;
        else
            return -1;

    }
}

public class Collection1 {
    public static void main(String[] args) {
        Student s1 = new Student("Ankit", 010020, 19);
        Student s2 = new Student("Raj", 010020, 19);
        Student s3 = new Student("Anuj", 010022, 18);
        List<Student> li = new ArrayList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        System.out.println(li);

        Alpaha al = new Alpaha();
        Collections.sort(li, al);
        System.out.println(li);
    }
}
