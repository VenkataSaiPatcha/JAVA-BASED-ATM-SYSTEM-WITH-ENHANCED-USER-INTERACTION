package Developing_Bank_Application;

public class Cutomer {
	
	private String name;
	private BankAccount account;
	
	public Cutomer(String name, BankAccount account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	public long getAccount()
	{
		return account.getAccountNumber();
	}
	

}
