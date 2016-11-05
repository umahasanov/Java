package generics;

import java.util.List;

/**
 * Created by Administrator on 14.10.16.
 */
public interface Container<E> {
    void add(E e);

    E get(int index);

    int size();

    List toList();

    void addAll(Container<? extends E> source);

    void addAllInto(Container<? super E> destination);
}
