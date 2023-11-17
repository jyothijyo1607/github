import java.util.Scanner;

public class ConsoleTest {
int  practHrs;
String res;

public void display() {
	System.out.println(practHrs+ " = "+res);
}
	public static void main(String[] args) {
		ConsoleTest test = new ConsoleTest();
		System.out.println("enter the pract hours");
		
		Scanner state = new Scanner(System.in);// creating obj for pre defined class "scanner"
	
		int hrs = state.nextInt();
		System.out.println("enter the result");
		String result = state.next();
		
		test.practHrs = hrs ;
		test.res = result;
		test.display();
		
		
		
	}
	
	
	
}
