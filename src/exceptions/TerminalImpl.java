package exceptions;

/**
 * Created by Administrator on 04.11.16.
 */
public class TerminalImpl implements Terminal {

    private final TerminalServer terminalServer;
    private final PinValidator pinValidator;

    public TerminalImpl(TerminalServer terminalServer, PinValidator pinValidator) {
        this.terminalServer = terminalServer;
        this.pinValidator = pinValidator;
        this.pinValidator.enterPinKod();
    }

    @Override
    public void putTheMoney(int sum) {
        if (sum > 0 && sum % 100 == 0) {
            terminalServer.putMoneyOnCurrentAccount(sum);
        } else {
            System.out.println("Сумма должна превышать 100$");
        }
    }

    @Override
    public int withdrawMoney(int sum) {
        if (hasEnoughMoney(sum)) {
            return sum;
        } else {
            System.out.println("Недостаточно средств на счету");
            return 0;
        }
    }

    @Override
    public boolean hasEnoughMoney(int sum) {
        return terminalServer.getRestOfMoney() >= sum && sum % 100 == 0;
    }

    public static void main(String[] args) {

    }
}
