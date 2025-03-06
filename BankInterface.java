package Developing_Bank_Application;

public interface BankInterface 
{
	void deposit(double amt) throws InvalidAmountException;
	void withdraw(double amt) throws InsufficientFundsException, InvalidAmountException;
	void transfer(BankAccount toAc, double amt) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
	void applyLoan(double amt) throws LoanNotAllowedException,InvalidAmountException;
	double getBalance();
}
