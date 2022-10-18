package com.java.test;
//TODO
public class Count {
	private void sol() {
		int i=4;
		int l=0;
		while(i>0) {
			System.out.println(i);
			i=i--;
			//System.out.println(i);
			//i--;
			//System.out.println(i);
			l++;
		}
		
		System.out.println(l);
	}

	public static void main(String[] args) {
		Count c= new Count();
		c.sol();
		
	}
}
