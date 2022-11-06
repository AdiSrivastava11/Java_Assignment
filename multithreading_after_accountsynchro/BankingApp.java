package multithreading_after_accountsynchro;

public class BankingApp {

	public static void main(String[] args) {
		
		
		Account ob = new Account("Aditya Srivastava",13,89000.3);
		
		Runnable r1 = new RunnableEx(ob);
		new Thread(r1).start();
		
		Runnable r2 = new RunnableEx(ob);
		new Thread(r2).start();

	}

}