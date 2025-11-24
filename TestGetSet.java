

class Student{
	private String name="hii";
	private int age;
	private float marks;
	
	
	public void Setage(int age) {
		this.age=age;
	}
	public int Getage() {
		return age;
	}
	
	public void Setname(String name) {
		this.name=name;
	}
	public String Getname() {
		return name;
	}
	
	public void Setmarks(float marks) {
		this.marks=marks;
	}

	
	public float Getmarks() {
		return marks;
	}

}
public class TestGetSet {
	public static void main(String[] args) {
		Student obj=new Student();
		
		obj.Setmarks(1111);
		obj.Setage(21);
		System.out.println(obj.Getname() +obj.Getage() +obj.Getmarks());
		
	}
	


}
