package com.java.test;

public class Dup2 {
	String S ="aabbcc";
	//String S ="abccbd";
	//String S ="ababa";
	
	//int[] C = new int[] {1,2,1,2,1,2};
	int[] C = new int[] {0,1,2,3,4,5};
	//int[] C = new int[] {1,2,1,2,1,2};
	    public void solution() {
	    
	        char[]str =S.toCharArray();
        	String s = "";
			int count=0;
            int cost=0;
            for (int i = 0; i < S.length()-1; i++) {
            	 
            	if(S.charAt(i) == S.charAt(i+1)) {
                System.out.print(S.charAt(i) + " ");
            	}
            }
            
        }
	      //  System.out.println(s);
	       // System.out.println(cost);
	    //}
		

	
	public static void main(String[] args) {
		Dup2 d = new Dup2();
		d.solution();

	}

}

