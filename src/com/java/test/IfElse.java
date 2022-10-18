package com.java.test;

public class IfElse {
	public static void main(String[] args) {
		IfElse i = new IfElse();
		i.sol();
		

	}

	private void sol() {
		int N=3;
		if (N>1 && N<100) {
	          if (N%2 ==1) {
	              System.out.println("Weired");
	          } else{
	              if (N>2 && N<5) {
	                  System.out.println("Not Weird");
	              } else if(N>6 && N<20){
	                  System.out.println("Weird");
	              }else{
	              System.out.println("Not Weird");
	              }
	          }  
	        } 
		
	}

}
