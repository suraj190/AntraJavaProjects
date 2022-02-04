import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


class Person{
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}


public class lmsHWJava8 {

    public List<String> search(List<Person> list) {//new Person(name, age, sex)

        List<String> result = new ArrayList<>();
        Person p1 = new Person("Arate",21,"male");
        Person p2 = new Person("Semba", 18, "male");
        Person p3 = new Person("Ang", 27, "male");
        Person p4 = new Person("Ava", 29, "female");

        list.clear();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        result = (List<String>) list.stream().filter(n->n.name.startsWith("A") && n.name.length()==3);

        return result;
    }

    public String getString(List<Integer> list) {

        return list.stream().map(n->{
            if(n%2 == 0){
                return "e" + n;
            }else{
                return "o" + n;
            }
        }).collect(Collectors.joining(","));

    }

    public Double average(List<Integer> list) {

        return list.stream().mapToDouble(n -> n).average().orElse(0);
    }

    public List<String> upperCase(List<String> list) {

        return list.stream().map(String::toUpperCase).collect(Collectors.toList());

    }




}