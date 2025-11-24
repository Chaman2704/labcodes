
public class PassArr {
	public PassArr(int a[]) {
		for(int i=0;i<5;i++) {
			a[i]=i*2;
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		int x[]=new int[5];
		new PassArr(x);
	}
}

