import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account(){
		
	}
	
	Account(int ident, double initialBal){
		id = ident;
		balance = initialBal;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyRate = annualInterestRate / 12;
		return monthlyRate;
	}
	
	public double getMonthlyInterest() {
		double monthlyInterest = balance * ((annualInterestRate / 12) / 100);
		return monthlyInterest;
	}
	
	public double withdraw(double remove) {
		balance -= remove;
		return balance;
	}
	
	public double deposit(double add) {
		balance += add;
		return balance;
	}
}
