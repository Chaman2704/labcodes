
 abstract class  MobilePhone{
	public abstract void Features();
	public void Colour() {
		System.out.println("Blue colour");
	}
}
 
class  Samsung extends MobilePhone{
	public void Features() {
		System.out.println("no features available");
	}
}
public class TestAbs {
	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.Colour();
		obj.Features();
	}
 
}
