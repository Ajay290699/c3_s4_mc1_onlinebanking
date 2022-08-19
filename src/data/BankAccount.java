package data;

public abstract class BankAccount {
    private String accountNo;
    private String accountOpeningdate;
    private String modeOdOperation;
    private String interenetbanking;
    private double totalBalance;
    private double availableBalance;
    private double rateOfInterest;

    public BankAccount(String accountNo, String accountOpeningdate, String modeOdOperation, String interenetbanking,
                       double totalBalance, double availableBalance, double rateOfInterest) {
        this.accountNo = accountNo;
        this.accountOpeningdate = accountOpeningdate;
        this.modeOdOperation = modeOdOperation;
        this.interenetbanking = interenetbanking;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.rateOfInterest = rateOfInterest;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountOpeningdate() {
        return accountOpeningdate;
    }

    public void setAccountOpeningdate(String accountOpeningdate) {
        this.accountOpeningdate = accountOpeningdate;
    }

    public String getModeOdOperation() {
        return modeOdOperation;
    }

    public void setModeOdOperation(String modeOdOperation) {
        this.modeOdOperation = modeOdOperation;
    }

    public String getInterenetbanking() {
        return interenetbanking;
    }

    public void setInterenetbanking(String interenetbanking) {
        this.interenetbanking = interenetbanking;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public void display() {
        System.out.println("accountNo = " + accountNo);
        System.out.println("accountOpeningdate = " + accountOpeningdate);
        System.out.println("modeOdOperation = " + modeOdOperation);
        System.out.println("interenetbanking = " + interenetbanking);
        System.out.println("totalBalance = " + totalBalance);
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("rateOfInterest = " + rateOfInterest);
    }
}
