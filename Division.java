import java.util.Scanner;
import java.util.InputMismatchException;


public class Division {
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter values of a and b");
			int a =sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			
			System.out.println("result"+c);
		}
		catch(InputMismatchException e) {
			System.out.println("enter valid input");
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
		finally {
            System.out.println("Program ended.");
        }
		}
}
