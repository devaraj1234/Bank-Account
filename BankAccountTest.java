package bank_account;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount();
		account.deposit("checking", 100);
		account.deposit("savings", 1000);
		account.withdraw("checking", 50);
		account.withdraw("savings", 250);
		account.getBalances();

	}

}