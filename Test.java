package Developing_Bank_Application;

@SuppressWarnings("serial")
class InsufficientFundsException extends Exception
{
	
	InsufficientFundsException(String withdraw)
	{
		super(withdraw);
		
	}
	
}

@SuppressWarnings("serial")
class InvalidAmountException extends Exception
{
	InvalidAmountException(String amount)
	{
		super(amount);
	}
}

@SuppressWarnings("serial")
class AccountNotFoundException extends Exception
{
	AccountNotFoundException(String notFound)
	{
		super(notFound);
	}
}

@SuppressWarnings("serial")
class LoanNotAllowedException extends Exception
{
	LoanNotAllowedException(String amount)
	{
		super(amount);
		
	}
}



public class Test 
{
	
	public static void main(String[] args) {
	

	}

}
