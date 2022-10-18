package com.java.test;

import java.text.DecimalFormat;

public class GetBinary {

	public static void main(String[] args) {
		GetBinary getBinary = new GetBinary();
				getBinary.solution();
	}

	private void solution() {
		int count=0;
		int maxBinGap=0;
		int num = 121;
		String binaryform="";
		
		while(num > 0)
	      {
	         int y = num % 2;
	         binaryform = y + binaryform;
	         num = num / 2;
	      }
		double[] arrayName = new double[10]; 
		arrayName[0] = ((double)14/49)*100;
		for (double d : arrayName) {
			
			
	            System.out.println("Number is :"+d +" and binary is "+binaryform);
	}
}
	
}
