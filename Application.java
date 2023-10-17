package Application;

public class Application {
	
	public static boolean App(int k, int [] numbers) {
	
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; i++)
			{
				
				if(numbers[i] + numbers[j] == k) 
					return true;
				}
			}

			return false;
	
}
	public static void main(String[] args) {
		int [] num = {2,4,6,8};
		System.out.println(App(10, num));

		
	}

}