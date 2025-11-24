
class Num{
	int a=10;
	int b=20;
	static int  c=40;
}
public class TestStatic {
	public static void main(String[] args) {
		Num obj=new Num();
		Num obj1=new Num();
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(Num.c);
		
		
	}
}
