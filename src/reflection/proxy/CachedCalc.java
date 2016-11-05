package reflection.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 31.10.16.
 */
public class CachedCalc implements Calculator {
    private final Map<String, Integer> cache = new HashMap<>();
    private Calculator calculator;

    private CachedCalc(Calculator calculator) {
        this.calculator = calculator;
    }

    public static Calculator cache(Calculator calculator) {
        return new CachedCalc(calculator);
    }

    @Override
    public int calc(String a) {
        if (cache.containsKey(a)) {
            return cache.get(a);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = calculator.calc(a);
        cache.put(a, result);

        return result;
    }
}
