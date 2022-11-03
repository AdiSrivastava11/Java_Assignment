package collection;

public class Account implements Comparable<Account>{

	private String accountname;
	private int acctnum;
	private double balance;

	public Account(String accountname, double balance,int acctnum) {
		super();
		this.accountname = accountname;
		this.acctnum = acctnum;
		this.balance = balance;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAcctNo() {
		return acctnum;
	}

	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}

	@Override
	    public String toString() {
	        return "[accname=" + accountname + ", acctnum=" + acctnum + ", balance=" + balance + "]";
	}
	
	@Override
	public int compareTo(Account a)
	{
		return this.acctnum - a.acctnum;
	}

}
