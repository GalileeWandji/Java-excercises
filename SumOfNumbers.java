package Application;

interface SumNumbers {
 	int sum(int a, int b);
}

public class SumOfNumbers {
	public static void main(String[] args) {

		SumNumbers add = (a, b) -> a+b;
		int result = add.sum(10, 5);
		System.out.println("The sum is " + result);
		
	}
}
