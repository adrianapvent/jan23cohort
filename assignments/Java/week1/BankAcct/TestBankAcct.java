

public class TestBankAcct {
    public static void main (String[] args) {
        BankAcct acct1 = new BankAcct();

        System.out.println(acct1.deposit(100, "checkings"));

        BankAcct.printTotalMoneyInAccts();
    }
}
