package exceptions;


/**
 * Created by Administrator on 04.11.16.
 */
public interface Terminal {

    void putTheMoney(int sum);

    int withdrawMoney(int sum);

    boolean hasEnoughMoney(int sum);

}
