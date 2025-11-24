import java.util.Scanner;

public class Logic {
	public int Opr() {
		Scanner scanner=new Scanner(System.in);
				System.out.println("enter the starting number");
				System.out.println("enter the ending sumber");
				int b=scanner.nextInt();
				int a=scanner.nextInt();
				int sum=0;
				for(int i=b;i<a;i++) {
					int count=0;
					for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
					}
				}	if(count==0) {
					sum++;
					
					
					
					System.out.println(i);
					
				}
				
	}
				
				return sum;
				
}
	public void Opra(int r) {
		Scanner scanner=new Scanner(System.in);
				System.out.println("enter the starting number");
				System.out.println("enter the ending sumber");
				int b=scanner.nextInt();
				int a=scanner.nextInt();
				
				int d=0;
				int c[]=new int[r];
				for(int i=b;i<a;i++) {
					int count=0;
					for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
					}
				}	if(count==0) {
					c[d]=i;
					d++;
					
				}
				
	}
				for(int i=0;i<d;i++) {
					System.out.println(c[i]);
				}
				
}
		public static void main(String[] args) {
			Prime obj=new Prime();
			int s=obj.Opr();
			obj.Opra(s);
			
		}
		
		
		
	}
