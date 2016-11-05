package generics;

/**
 * Created by Administrator on 14.10.16.
 */
public class Main {
    public static void main(String[] args) {
        Container<String> container = new FixedSizeContainer<>(10);
        container.add("BB");
        container.add("AA");
        container.add("Soch");
        container.add("Max");

        Container<String> container1 = new FixedSizeContainer<>(10);
        container1.addAll(container);

        for (int i = 0; i < container1.size(); i++) {
            System.out.println(container1.get(i));
        }
    }
}
