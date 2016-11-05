package reflection;


import reflection.proxy.Calculator;
import reflection.proxy.CalculatorImpl;

import static reflection.proxy.CachedCalc.cache;

/**
 * Created by Administrator on 31.10.16.
 */
public class Main {
    public static void main(String[] args) {
        Calculator c = cache(new CalculatorImpl());
        System.out.println(c.calc("Alex"));
        System.out.println(c.calc("Alddasdfadsfadf"));
        System.out.println(c.calc("Aledsfsdfa"));
        System.out.println(c.calc("Alex"));
    }
}
