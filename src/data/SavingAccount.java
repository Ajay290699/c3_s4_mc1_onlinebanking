package data;

public class SavingAccount extends BankAccount {
    private float interestRate;

    public SavingAccount(String accountNo, String accountOpeningdate, String modeOdOperation, String interenetbanking,
                         double totalBalance, double availableBalance, double rateOfInterest, float interestrate) {
        super(accountNo, accountOpeningdate, modeOdOperation, interenetbanking, totalBalance, availableBalance, rateOfInterest);
        this.interestRate = interestrate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public void display1() {
        display();
        System.out.println("interestRate = " + interestRate);
    }

    public void retrieveBalance() {
        System.out.println(getAvailableBalance());
    }

    public void debit(double balance, double amount) {
        double balance1 = getAvailableBalance() - amount;
        System.out.println(balance1);
    }

    public void credit(double balance, double amount) {
        double balance1 = getAvailableBalance() + amount;
        System.out.println(balance1);
    }
}
