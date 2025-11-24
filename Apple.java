import java.util.Scanner;

 class abc {
	public void Add(int a, int b) {
		System.out.println(a+b);
	}

}
 
 class Child extends abc{
	 public void Add(int a , int b) {
		 System.out.println(a*b);
	 }
	 
 }

public class Apple {
	public static void main(String[] args) {
		int c,d;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two numbers");
		c=scanner.nextInt();
		d=scanner.nextInt();
		abc obj = new Child();
		obj.Add(c, d);
	}
}
