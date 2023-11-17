// armstrong means the sum of cubes of number is equal to that number
// eg: 153 = 1^3 + 5^3 + 3^3 ( 1 cube + 5 cube + 3 cube)

public class Armstrong {

	public static void main(String[] args) {
		int i= 156; 
		double armstrong=0;
		double temp;
		int original = i;
		
		while (i>0) {
			temp = i%10; // i%10 value is 3
			temp = Math.pow(temp, 3) ; // formuale for cubing a number
			
			armstrong = armstrong + temp ;  // armstrong value is 3^3 = 9 
			i = i/10;   // i/10 value is 15.... here we cube 5 and then 1 
			}
		if(armstrong == original)
		{
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
	}
	
	
	
}

