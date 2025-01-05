package exception;
class InvalidWithdrawalException extends Exception{
	public InvalidWithdrawalException(String message) {
		super(message);
	}
}
public class ComprehensiveExample {
public static void main(String[] args) {
	try {
		withdrawAmount(500,10000);
	} catch (InvalidWithdrawalException e) {
	 System.out.println("Exception "+e.getMessage());
	}finally {
		System.out.println("Transaction completed");
	}
}
private static void withdrawAmount(double balance,double amount)   throws InvalidWithdrawalException  {
	if (amount>balance) {
		throw new InvalidWithdrawalException("Insufficient funds. Available balance: "+balance);
	}
	System.out.println("Withdrawal successful! Remaining balance: "+(amount-balance));
}
}
