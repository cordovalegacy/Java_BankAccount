import static java.lang.System.out;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        out.println("<----Running App---->");

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount(200.00, 200.00);

        out.println(account1.getChecking());
        out.println(account1.getSavings());
        out.println("Account Number: " + account1.getAccountNumber());
        account2.setChecking(500.00);
        account2.setSavings(500.00);
        out.println(account2.getChecking());
        out.println(account2.getSavings());
        out.println("Account Number: " + account2.getAccountNumber());
        out.println(account1.getAccountCount());
        out.println(account1.getTotalMonies());
        out.println("Account Number: " + account3.getAccountNumber());
    }
}