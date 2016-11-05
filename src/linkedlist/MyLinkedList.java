package linkedlist;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


/**
 * Created by Administrator on 24.10.16.
 */
public class MyLinkedList<E> implements LinkedList<E> {

    private int size;
    private Entry<E> first;
    private Entry<E> last;
    private Entry<E> header;

    public MyLinkedList() {
    }

    @Override
    public void add(E e) {
        if (size == 0) {
            Entry<E> entry = new Entry<>(e, first, last);
            entry.prev.next = entry;
            entry.next.prev = entry;
            size++;
        } else {
            Entry<E> entry = new Entry<>(e, first, first.next);
        }
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public List toList() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> tail)
        {
            this.element = element;
            this.next = next;
            this.prev = tail;
        }
    }

    private Entry<E> entry(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);

        Entry<E> e = header;

        if (index < (size >> 1))
        {
            for (int i = 0; i <= index; i++)
                e = e.next;
        }
        else
        {
            for (int i = size; i > index; i--)
                e = e.prev;
        }

        return e;
    }

}
