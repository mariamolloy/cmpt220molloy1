
public class MyInteger {
	
	public int value = 0;
	
	MyInteger(int myInt){
		value = myInt;
	}
	
	public int getInt() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) 
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		if (value % 2 == 1) 
			return true;
		else
			return false;
	}
	
	public boolean isPrime() {
		for (int j = 2; j <= (value / 2); j++ ) {
			if (value % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int i) {
		if (i % 2 == 0) 
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int i) {
		if (i % 2 == 1) 
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int i) {
		for (int j = 2; j <= (i / 2); j++ ) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean equals(int i) {
		if (i == value) {
			return true;
		}
		else 
			return false; 
	}
	
	public boolean equals(MyInteger myInt) {
		if (this.value == myInt.getInt()) {
			return true;
		}
		else 
			return false; 
	}
	
	public static int parseInt(char[] arr) {
		int myInt = 0;
		for (int i = 0, j = (int)Math.pow(10, arr.length - 1); i < arr.length; i++, j /= 10) {
			myInt += ((int)arr[i] - 48) * j;
		}
		return myInt;
	}
	
	public static int parseInt(String str) {
		int myInt = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1); i < str.length(); i++, j /= 10) {
			char ch = str.charAt(i);
			myInt += ((int)ch - 48) * j;
		}
		return myInt;
	}
	

}
