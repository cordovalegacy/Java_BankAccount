
public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int accounts = 0; //sum of all accounts (per person)
    private static double totalMoney = 0; //sum of all checking and savings
    private static String characters = "0123456789";

    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = generateRandomNumberString(10);
        accounts ++;
    }

    public BankAccount(double checking, double savings){
        this.checkingBalance = checking;
        this.savingsBalance = savings;
        this.accountNumber = generateRandomNumberString(10);
        accounts ++;
        totalMoney += (this.checkingBalance + this.savingsBalance);
    }

    //! GETTERS/SETTERS

    public double getChecking(){
        return this.checkingBalance;
    }

    public double setChecking(double deposit){
        totalMoney += deposit;
        return this.checkingBalance += deposit;
    }

    public double getSavings(){
        return this.savingsBalance;
    }

    public double setSavings(double deposit){
        totalMoney += deposit;
        return this.savingsBalance += deposit;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    //! METHODS

    public static int getAccountCount(){
        return accounts;
    }

    public static double getTotalMonies(){
        return totalMoney;
    }

    private String generateRandomNumberString(int length) {
        StringBuilder accountString = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomDigit = (int) (Math.random() * characters.length());
            accountString.append(characters.charAt(randomDigit));
        }
        return accountString.toString();
    }

}