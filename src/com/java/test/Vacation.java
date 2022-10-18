package com.java.test;

import java.util.ArrayList;
import java.util.List;


public class Vacation {
	public int solution(int[] A) {

		List<Integer> l = new ArrayList<Integer>();
		List<Integer> s = new ArrayList<Integer>();
		
		
		for (int i = 0; i < A.length; i++) {
			if (l.indexOf(A[i]) == -1) {
				l.add((Integer)A[i]);
			} else if (l.indexOf(A[i]) == 0 ){
				l.remove((Integer)A[i]);
				l.add((Integer)A[i]);
			}else {
				l.add((Integer)A[i]);
			}
		}

		
		for(int i = l.size()-1; i >= 0; i--){
			if (s.indexOf(l.get(i)) == -1) {
				s.add(l.get(i));
			} else if (s.indexOf(l.get(i)) == 0 ){
				s.remove(l.get(i));
				s.add(l.get(i));
			}else {
				s.add(l.get(i));
			}
		}
		
		for(Integer e : s){
			System.out.println(e);
		}
		
		return s.size();	
	}
	
	public static void main(String[] args) {
	Vacation v = new Vacation();
	int[] A = new int[] {2,1,1,3,2,1,1,3};
	v.solution(A);
	}

	
}
