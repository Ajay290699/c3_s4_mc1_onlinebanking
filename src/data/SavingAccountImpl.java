package data;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("UNION123456", "10/06/2022", "Self",
                "Enabled", 1000, 800, 8, 11.5f);
        RecuringDepositAccount recuringDepositAccount = new RecuringDepositAccount("SBI987654", "25/07/2021",
                "Joint", "Enabled", 5000, 4500, 8, "19/08/2022",
                5);

        System.out.println("Saving Account Details :");
        System.out.println("-------------------------------");
        savingAccount.display1();
        System.out.println();
        System.out.println("Saving Account Closing Details :");
        System.out.println("-------------------------------");
        recuringDepositAccount.display2();
        System.out.println();

        System.out.println("Check Balance :");
        savingAccount.retrieveBalance();
        System.out.println();
        System.out.println("Credited balance :");
        savingAccount.credit(savingAccount.getAvailableBalance(), 100);
        System.out.println();
        System.out.println("Debited balance :");
        savingAccount.debit(savingAccount.getAvailableBalance(), 100);

    }
}
