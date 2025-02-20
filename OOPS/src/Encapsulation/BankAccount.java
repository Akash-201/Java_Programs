package Encapsulation;

//Q: Create a class "BankAccount" with encapsulation
//Create a class BankAccount with private variables:
//accountNumber (String)
//balance (double)
//Use getter and setter methods to access and update balance securely.
//Write a method deposit(double amount) to add money.
//Write a method withdraw(double amount) to withdraw money (only if sufficient balance).

public class BankAccount
{
	private String accountNumber;
	private double balance;

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public void deposit(double amount)
	{
		if(amount>0)
		{
			setBalance(this.balance+amount);
			System.out.println("Deposited: " + amount);
		}
		else
		{

			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount)
	{
		if(amount>0 && amount<this.balance)
		{
			setBalance(this.balance-amount);
			System.out.println("Withdrawn: " + amount);
		}
		else if(amount > this.balance)
		{
			System.out.println("Insufficient balance.");
		}
		else
		{
			System.out.println("Withdrawal amount must be positive.");

		}
	}
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		account.setAccountNumber("1234567890");
		account.deposit(1000);
		account.withdraw(500);
		account.withdraw(600);
		

		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Current Balance: " + account.getBalance());
	}





}
