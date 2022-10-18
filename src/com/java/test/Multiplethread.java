package com.java.test;

public class Multiplethread implements Runnable {
	String name;
	Thread t;
	
	Multiplethread (String thread){
	    name = thread; 
	    t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
		}
	
	


	@Override
	public void run() {
		try {
		     for(int i = 5; i > 0; i--) {
		     System.out.println(name + ": " + i);
		      Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
		     System.out.println(name + "Interrupted");
		}
		     System.out.println(name + " exiting.");
		}
	
	public static void main(String[] args) {
			new Multiplethread("One");
			new Multiplethread("Two");
			new Multiplethread("Three");
			try {
			     Thread.sleep(10000);
			} catch (InterruptedException e) {
			      System.out.println("Main thread Interrupted");
			}
			      System.out.println("Main thread exiting.");
			}

}
