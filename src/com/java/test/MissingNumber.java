package com.java.test;

public class MissingNumber {



	public static void main(String[] args) {
		MissingNumber m = new MissingNumber();
		m.sol();
	}

	private void sol() {
		int range =5;
		int []inpuArray = new int[]{1,2,4,5};
		int sumofAll=range*(range+1)/2;
		int sumOfAarry = 0;
		
		for (int i = 0; i < inpuArray.length; i++) {
			sumOfAarry=sumOfAarry+inpuArray[i];
		}
		System.out.println(sumofAll-sumOfAarry);
	}
	
	

}
