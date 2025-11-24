

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
			Thread.sleep(3000);
		System.out.println("i m 1");}
			
		catch(Exception e) {
			System.out.println(e);
		}
			
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i m 2");}
	}
}
public class TestThread {
	public static void main(String args[]) {
	
	MyThread obj=new MyThread(); 
	MyThread2 test=new MyThread2(); 
	
	test.start();
	obj.start();
	obj.interrupt();

	}
}
