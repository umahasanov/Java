package exceptions;

/**
 * Created by Administrator on 04.11.16.
 */
public class TerminalServer {
    private int restOfMoney = 150_000;

    public TerminalServer() {
    }

    public int getRestOfMoney() {
        return restOfMoney;
    }

    public void putMoneyOnCurrentAccount(int sum) {
        restOfMoney += sum;
    }
}
