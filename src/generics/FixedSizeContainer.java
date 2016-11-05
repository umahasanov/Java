package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 14.10.16.
 */
public class FixedSizeContainer<E> implements Container<E> {

    private final Object[] objects;
    private int size;

    public FixedSizeContainer(int size) {
        this.objects = new Object[size];
    }

    @Override
    public void add(E e) {
        objects[size++] = e;
    }

    @Override
    public E get(int index) {
        return (E) objects[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List toList() {
        return Arrays.asList(objects);
    }

    @Override
    public void addAll(Container<? extends E> source) {
        for (int i = 0; i < source.size(); i++) {
            add(source.get(i));
        }

    }

    @Override
    public void addAllInto(Container<? super E> destination) {
        for (int i = 0; i < size; i++) {
            destination.add(get(i));
        }
    }

}
