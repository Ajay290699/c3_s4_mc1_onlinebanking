package data;

public class RecuringDepositAccount extends BankAccount {
    private String closingDate;
    private int duration;

    public RecuringDepositAccount(String accountNo, String accountOpeningdate, String modeOdOperation, String interenetbanking,
                                  double totalBalance, double availableBalance, double rateOfInterest, String closingDate,
                                  int duration) {
        super(accountNo, accountOpeningdate, modeOdOperation, interenetbanking, totalBalance, availableBalance, rateOfInterest);
        this.closingDate = closingDate;
        this.duration = duration;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void display2() {
        display();
        System.out.println("closingDate = " + closingDate);
        System.out.println("duration = " + duration);
    }
}
