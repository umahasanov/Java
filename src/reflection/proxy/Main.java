package reflection.proxy;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Administrator on 01.11.16.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        URL location = Calculator.class.getProtectionDomain().getCodeSource().getLocation();
        URL[] urls = {location};

        URLClassLoader urlClassLoader = new URLClassLoader(urls);
        Class<?> clazz = urlClassLoader.loadClass("reflection.proxy.CalculatorImpl");
        System.out.println(clazz.getClassLoader());

    }
}
