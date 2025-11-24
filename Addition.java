import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=1;
		int sum=0;
		String a[]=new String[10];
		String b[]=new String[10];
		System.out.println("enter first name");
		for(int i=0;i<10;i++) {
			a[i]=obj.next();
	
		}
		System.out.println("enter second name");
		for(int i=0;i<10;i++) {
			b[i]=obj.next();
		}
		String c[]=new String[a.length+b.length];
		for(int i=0; i<a.length;i++) {
		 
			 try {
				 if(Integer.parseInt(a[i])%n==0) {
					 sum=sum+Integer.parseInt(a[i]);
				 }
			 }
			 catch(Exception e) {
			
			}}
			 for(int i=0; i<b.length;i++) {
				 
				 try {
					 if(Integer.parseInt(b[i])%n==0) {
						 sum=sum+Integer.parseInt(a[i]);
					 }
				 }
				 catch(Exception e) {
				
				}	 
		
		
		
		
	}
			 System.out.println(sum);
}}
