import java.util.Scanner;

public class User {
	
	
	
		
		public int addition () {
			int a,b,c;
		Scanner num = new Scanner(System.in);
		a=num.nextInt();
		b=num.nextInt();
		c=a+b;
		if(c>30) {
			return c;
		}
		else {
			System.out.println("entered");
			return addition();
		}
		}
	}
	
