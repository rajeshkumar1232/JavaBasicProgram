package com.java.test;

public class FibonaciSeries {

	public static void main(String[] args) {
		FibonaciSeries fs = new FibonaciSeries();
		fs.sol();
	}

	public void sol() {
		int numofseries = 10;
		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		System.out.println(num1);
		System.out.println(num2);
	
		while (counter+2<numofseries) {
			int num = num1+num2;
			System.out.println(num);
			num1 = num2;
			num2 = num;
			counter++;
		}
		
	}
}
