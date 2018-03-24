
public class MyInteger10_3 {

	public static void main(String[] args) {
		int i = 15;
		MyInteger myInt = new MyInteger(15);
		
		System.out.println(myInt.getInt());
		
		System.out.println(myInt.isEven());
		System.out.println(myInt.isOdd());
		System.out.println(myInt.isPrime());
		
		System.out.println(MyInteger.isEven(i));
		System.out.println(MyInteger.isOdd(i));
		System.out.println(MyInteger.isPrime(i));
		
		System.out.println(MyInteger.isEven(myInt));
		System.out.println(MyInteger.isOdd(myInt));
		System.out.println(MyInteger.isPrime(myInt));
		
		System.out.println(myInt.equals(12));
		
		MyInteger newInt = new MyInteger(12);
		System.out.println(myInt.equals(newInt));
		
		
		char[] arr = {'1', '9', '1', '4'};
		System.out.println(MyInteger.parseInt(arr));
		
		String str = "1234";
		System.out.println(MyInteger.parseInt(str));
		
	}

}
