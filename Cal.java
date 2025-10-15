package com.test;

public class Cal {
	public  int  Num(int a , int b) {
		return (a+b);
		}
		
	public  int  Num( int  a) {
		return (a*a);
		}
	
	}

class Sub extends Cal{
	public int Num(int a,int b) {
		return (a-b);
	}
}