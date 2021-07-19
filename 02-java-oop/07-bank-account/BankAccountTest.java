public class BankAccountTest {
    public static void main (String[] args){
        BankAccount ba = new BankAccount();

        //do I want to display a random account number here?.

        //ba.getRandomAccount(); why not working

        
        ba.depositMoney(100,"checking");
        ba.depositMoney(50.02,"savings");
        ba.showTotalBalance();

        ba.withdrawMoney(20, "checking");
        ba.withdrawMoney(51.00, "savings");
        ba.showTotalBalance();
    }

}
