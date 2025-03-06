package Developing_Bank_Application;

public class BankAccount implements BankInterface
{
	private long accountNumber;
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public void deposit(double amt) throws InvalidAmountException
	{
		if(amt<=0)
		{
			throw new InvalidAmountException("Amount is Invalid");
		}
		
	}
	@Override
	public void withdraw(double amt) throws InsufficientFundsException, InvalidAmountException {
		if(amt>balance)
		{
			throw new InsufficientFundsException("Insufficient Balance");
		}
		else {
			throw new InvalidAmountException("Invalid Amount");
		}
		
	}
	@Override
	public void transfer(BankAccount toAc, double amt)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		if(amt> balance)
		{
			throw new AccountNotFoundException("Account is not found");
		}
		else
		{
			throw new InvalidAmountException("invalid amount");
		}
	}
	@Override
	public void applyLoan(double amt) throws LoanNotAllowedException, InvalidAmountException 
	{
		if(amt>50000)
		{
			throw new LoanNotAllowedException("Loan was not allowed");
		}
		else
		{
			throw new InvalidAmountException("Invalid amount ");
		}
		
		
	}
	@Override
	public double getBalance() {
		return balance;
	}
	

}
