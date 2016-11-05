package generics.hw;

import java.util.Map;

/**
 * Created by Administrator on 02.11.16.
 */
public interface CountMap<T> {
    void add(T elem);

    int getCount(T elem);

    int remove(T elem);

    int size();

    void addAll(CountMap<? extends T> source);

    Map toMap();

    void toMap(Map<? super T, Integer> destination);


}
