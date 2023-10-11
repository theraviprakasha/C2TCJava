package com.tnsif.multithreading;

import java.io.Serializable;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "First"); 
		ChildThread t2 = new ChildThread(10, "Second"); 

		System.out.println("Current Thread: " + Thread.currentThread());
		t1.start();
		t2.start();
		Thread.currentThread().setName("Parent Thread"); 
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); 
		System.out.println("Current Thread: " + Thread.currentThread());
		try {
			t1.join(); // wait current thread until t1 is dead
			t2.join(); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Restore interrupted status
			System.err.println("Thread interrupted: " + e.getMessage());
		}
	}
}
