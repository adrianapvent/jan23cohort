public class TestBankAcct {
    public static void main (String[] args) {
        BankAccount acct1 = new BankAccount();
        BankAccount acct2 = new BankAccount();

        System.out.println(acct1.depositFunds(1, "checkings"));
        System.out.println(acct1.depositFunds(2, "checkings"));
        System.out.println(acct1.depositFunds(3, "savings"));
        System.out.println(acct1.depositFunds(4, "savings"));
        System.out.println(acct1.withdrawFunds(1, "checkings"));
        System.out.println(acct1.getCheckingBalance());

        BankAccount.printTotalMoneyInAccts();
    }
}

