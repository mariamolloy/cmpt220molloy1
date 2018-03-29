
public class Savings extends Account{

	Savings(){
		super();
	}
	
	Savings(int id, double bal){
		super(id, bal);
	}
	
	public double withdraw(double remove) {
		if (remove < getBalance()) {
			setBalance(getBalance() - remove);
			return getBalance();
		}
		else {
			System.out.println("Error! Account cannot be overdrawn");
			return getBalance();
		}
	
	}
	
}
