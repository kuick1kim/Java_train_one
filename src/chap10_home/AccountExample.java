package chap10_home;

public class AccountExample {
	public static void mail(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("¿¹±Ý¾× :" + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			// TODO: handle exception
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			
		}
	}

}
