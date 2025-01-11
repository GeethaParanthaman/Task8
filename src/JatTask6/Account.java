package JatTask6;

public class Account {
	private String accountHolderName;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	private double balance;
	private String accountNumber;
	
	//No aregument Constructor
	public Account()
	{
		this.accountNumber="";
		this.balance=0.0;
		this.accountHolderName="";
		
	}
	// Constructor with arguments
	public Account(String accountHolderName,double balance,String accountNumber)
	{
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	//method to deposit money
	public void deposit(double amount)
	
	{
		
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposietd: "+amount+ ".New Balance is "+balance);
		}
		else
		{
			System.out.println("Deposit amount must be positive");
		}
	}
	//Method to withdraw money
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println("Withdrawn: "+amount+ ".Remaining blance is "+balance);
			}
			else
			{
				System.out.println("amount is insuffiecient");
			}
		}
			else
			{
				System.out.println("Withdrawal amount must be positive");
		}
		
	
	
}
	public double checkBalance()
	{
		return balance;
	}
	public static void main(String[] args) {
        // Example usage
		//No argument contructor
		Account account1=new Account();
		account1.setAccountHolderName("Geesara");
		account1.setAccountNumber("IN12345678");
		account1.deposit(3000);
		account1.withdraw(1000);
		account1.checkBalance();
		
		//with arguments
		Account account2=new Account("Test",5000,"T10000");
		account2.deposit(2000);
		account2.withdraw(1000);
		account2.checkBalance();
		
		
		
		
	}
	
}
