
public class EmployeTest {
	public static void main(String[] args) {
		Employee obj= new Employee("Alice","wonderland",45000);
		Employee abc= new Employee("Thomas" ,"Shelby",25000);
		
		System.out.println(obj.getname() +obj.getlastname() +obj.getmonthlysalary());
		System.out.println(abc.getname() +abc.getlastname() +abc.getmonthlysalary());
		obj.setname("chaman");
		System.out.println(obj.getname() +obj.getlastname() +obj.getmonthlysalary());
		System.out.println("After 10% raise");
		obj.setraise(450000);
		System.out.println(obj.getmonthlysalary());
		System.out.println(obj.getname() +obj.getlastname() +obj.getmonthlysalary());
	}
}
class Employee {
	private String name;
	private String lastname;
	private double monthlysalary;
	
	
	
	public void setname(String name) {
		this.name=name;
	}
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	public void setmonthlysalary(double monthlysalary) {
		if(monthlysalary>0) {
			this.monthlysalary=monthlysalary;
		}
		else
			this.monthlysalary=0.0;
	}
	public String getname() {
		return name;
	}
	public String getlastname() {
		return lastname;
	}
	public double getmonthlysalary() {
		return monthlysalary;
	}
	public double setraise(double n) {
		double s=n/10;
		n=n+s;
		return this.monthlysalary=n;
	}
}