import java.util.Scanner;

public class Prime {
	int a,b;
	public int FirstPart(){
		Scanner scanner=new Scanner(System.in);
				System.out.println("enter the starting number");
				System.out.println("enter the ending sumber");
				b=scanner.nextInt();
				a=scanner.nextInt();
				int sum=0,element=0;
				for(int i=b;i<a;i++) {
					int count=0;
					for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
					}
				}	if(count==0) {
					element=i;
					sum++;
					
					
					
				
					
				}
				
	}
				return (sum);
	}
	public static void main(String[] args){
		int c;
			Prime obj=new Prime();
			c=obj.FirstPart();
			int d[]=new int[c];
			int index=0;
			
			for(int i=obj.b;i<obj.a;i++) {
				int count=0;
				for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}	if(count==0) {
				d[index]=i;
				index++;
				
				
			
				
			}
			
}
			
		
	for(int j=0;j<c;j++) {
	System.out.println(d[j]);
	}
	
}}