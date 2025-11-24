import java.util.ArrayList;
import java.util.List;

public class Testerdata {
	public static void main(String[] args) {
		
		
		AccountData obj1=new AccountData(1,"chaman",12345,250000);
		AccountData obj2=new AccountData(2,"akash",123456,5000);
		AccountData obj3=new AccountData(3,"ankur",123456,50000);
		AccountData obj4=new AccountData(4,"om",123456,5200000);
		AccountData obj5=new AccountData(5,"alakh",123456,50800);
		
		
		List<AccountData> jj=new ArrayList<>();
		jj.add(obj5);
		jj.add(obj4);
		jj.add(obj3);
		jj.add(obj2);
		jj.add(obj1);
		
		float max=0;
		String name="";
		for(AccountData x:jj) {
			if(x.getBalance()>max) {
				max=x.getBalance();
				name=x.getname();
			}
		}
		System.out.println(""+max+""+name);
		}
	
}
