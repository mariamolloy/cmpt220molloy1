
public class Checking extends Account{
	private double overdraftLimit = 0;
	
	Checking(){
		super();
	}
	
	Checking(double over, int id, double bal){
		super(id, bal);
		overdraftLimit = over;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double newOver) {
		this.overdraftLimit = newOver;
	}
	
	public double withdraw(double remove) {
		if (getBalance() - remove > overdraftLimit) {
			setBalance(getBalance() - remove);
			return getBalance();
		}
		else {
			System.out.println("Error! Amount exceeds overdraft limit");
			return getBalance();
		}
	
	}
	
	public String toString() {
		return super.toString() + "\n Overdraft limit = " + overdraftLimit;
	}
	
}
