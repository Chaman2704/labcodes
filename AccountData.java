
public class AccountData {
	int id;
	String name;
	double Accountno;
	float Balance;
	public AccountData(int id,String name,double Accountno,float Balance) {
		this.id=id;
		this.name=name;
		this.Accountno=Accountno;
		this.Balance=Balance;
		
		}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public double getAccountno() {
		return Accountno;
	}
	public float getBalance() {
		return Balance;}
}

