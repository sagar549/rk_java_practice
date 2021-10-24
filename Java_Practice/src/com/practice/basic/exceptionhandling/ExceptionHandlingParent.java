package com.practice.basic.exceptionhandling;

public class ExceptionHandlingParent {
	
	ExceptionHandlingParent() {
		System.out.println("ExceptionHandling Class Initialized");
	}
	
	public void initializeCheckedException() {
		createCheckedException();
	}
	public void createCheckedException() {
		int i = 0,j =1;
		try {
			System.out.println("Possible Exception " +j/i);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e);
			throw e;
		}
	}
	
	public void initializeUnCheckedException() throws ClassNotFoundException {
		createUncheckedException();
	}
	
	public void createUncheckedException() throws ClassNotFoundException {
		try {
			Class.forName("fff");
		} catch (ClassNotFoundException e) {
			throw e;
		}
	}
	
	public String initilaizeExceptionWithFinally() {
		try {
			System.out.println("Inside try");
			throw new Exception();
//			return "try";
		}
		catch(Exception e) {
			return "catch";
		}
		finally {
			System.out.println("finally");
//			return "finally";
		}
	}
	
	public String initilaizeExceptionWithFinallyInterruped() throws InterruptedException {
		try {
			System.out.println("Inside try");
			Thread.sleep(10000);
			return "try";		
		}
		catch(InterruptedException e) {
			throw e;
		}
		finally {
			System.out.println("finally");
		}		
	}
	
	public static void main(String args[]) {
		ExceptionHandlingParent exceptionHandlingParent = new ExceptionHandlingParent();
		try {
			exceptionHandlingParent.initializeCheckedException();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			exceptionHandlingParent.initializeUnCheckedException();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(exceptionHandlingParent.initilaizeExceptionWithFinally());
		
		Thread exceptionFinallyThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(exceptionHandlingParent.initilaizeExceptionWithFinallyInterruped());
				} catch (InterruptedException e) {
					e.printStackTrace();
				};			
			}
			
		});
		
		exceptionFinallyThread.start();
		
		exceptionFinallyThread.interrupt();
		
	}
}
