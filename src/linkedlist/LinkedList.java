package linkedlist;

import java.util.List;

/**
 * Created by Administrator on 24.10.16.
 */
public interface LinkedList<E> extends Iterable {
    void add(E e);

    void add(int index, E e);

    E getFirst();

    E getLast();

    List toList();

    int size();
}
