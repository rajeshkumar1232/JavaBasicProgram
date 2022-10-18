package com.java.test;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.sol();
	}
	
	public void sol() {
		
		int factorialnum =5;
		int j=1;
		while(factorialnum >0) {
			j=j*factorialnum;
			factorialnum--;
		}
		System.out.println(j);
	}
}
