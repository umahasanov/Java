package reflection.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 31.10.16.
 */
public class CalculatorImpl implements Calculator{

    @Override
    public int calc(String a) {

        return 10 + a.length();

    }
}
