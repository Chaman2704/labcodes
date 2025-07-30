
import java.util.Scanner;

public class Arr {
	public int Check(){
		int a,b,c;
		Scanner num=new Scanner(System.in);
		System.out.println("enter two number");
		a=num.nextInt();
		b=num.nextInt();
		c= a+b;
		if(c>30) {
			return c;
		}
		else {
			System.out.println("entered");
			return Check();

		}
		
	}
}
