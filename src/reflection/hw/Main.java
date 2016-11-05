package reflection.hw;

/**
 * Created by Administrator on 04.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Person1 person1 = new Person1("fsdf", 21);
        Person2 person2 = new Person2("fsdfasdaf", 34);
        BeanUtils.assign(person1, person2);
        System.out.println(person1.getName() + " " + person1.getAge());
    }
}
