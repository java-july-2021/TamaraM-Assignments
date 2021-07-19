import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfAccounts=0; //number of created acct.
    public static double totalAmount=0; //tracks the total amount of money stored in every act created

    //Getters and setters
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    //getter method for checking
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance=checkingBalance;
    }
    //getter method for savings
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void savingsBalance(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }

    private String randomAccount(){
        Random r = new Random();
        //not sure how to retur random 10 digit account
        String account = "";
        for(int i=0; i<10; i++){
            account += r.nextInt();
            //System.out.println("Random account number: " + account);
        }
        //numberOfAccounts+=1;
        return account;
        
    }


    //Constractor
    public BankAccount(){
        /*why doesnt work: BankAccount(String accountNumber, double checkingBalance, double savingsBalance)
        this.accountNumber=accountNumber;
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;*/
        randomAccount();
        numberOfAccounts+=1;
    }
    //deposit money
    public void depositMoney(double amount, String account){
        if(account.equals("checking")){
            this.checkingBalance += amount;
        }
        else if(account.equals("savings")){
            this.savingsBalance+=amount;
        }
        totalAmount += amount;
    }
    //withdraw money
    public void withdrawMoney(double amount, String account){
        if(account.equals("checking") && this.checkingBalance-amount>=0){
            this.checkingBalance -= amount;
        }
        else if (account.equals("savings") && this.savingsBalance-amount>=0){
            this.savingsBalance -= amount;
        }
        else{
            System.out.println("Transaction declined. Insufficient funds on the account.");
        }
        totalAmount -= amount;
    }
    public void showTotalBalance(){
        System.out.println("Checking balance: " + this.checkingBalance + ".");
        System.out.println("Savings balance: " + this.savingsBalance + ".");
        System.out.println("Total balance: " + (this.checkingBalance + this.savingsBalance) + ".");
    }


}