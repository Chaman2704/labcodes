import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a,b,d,choice;
		Scanner num =new Scanner(System.in);
		System.out.println("numbers should be divided by 3,4,or 5 enter ur prefernce");
		choice=num.nextInt();
		System.out.println("enter range");
		b=num.nextInt();
		d=num.nextInt();
		
		
		
		int c=0;
		if(choice==3) {
			
		
		
		for(int j=b;j<=d;j++) {
			if(j%3==0) {
				c++;
			}
			
		}System.out.println("number divisible by 3 is" +c);}
		else if(choice==4) {
		
		for(int j=b;j<=d;j++) {
			if(j%4==0) {
				c++;
			}
			
		}
		System.out.println("number divisible by 4 is" +c);}
		
		else {
			
		
		for(int j=b;j<=d;j++) {
			if(j%5==0) {
				c++;
			}
			
		}
		System.out.println("number divisible by 5 is" +c);}
	} 
	
	
	
	
}

