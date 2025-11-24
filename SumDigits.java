import java.util.Scanner;

public class SumDigits {
	public void Logic(int n) {
		int res=0;
		while(n>0) {
			res=res+n%10;
			n=n/10;
		}
	System.out.println("sum of the digits is " + res);
	}
	public static void main(String[] args) {
		SumDigits obj=new SumDigits();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scanner.nextInt();
		obj.Logic(n);
	}
}
