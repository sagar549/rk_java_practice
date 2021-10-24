package com.practice.basic.exceptionhandling;

public class ExceptionHandlingChild extends ExceptionHandlingParent{
	
	//Can declare unchecked exception in child class overriden methods but not Checked Exceptions
	@Override
	public void initializeCheckedException() throws RuntimeException{
		createCheckedException();
	}
	
	@Override
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
	
	//Can only declare same or subclass of Exception declared in parent class overriden method
	@Override
	public void initializeUnCheckedException() throws ClassNotFoundException {
		createUncheckedException();
	}
	
	@Override
	public void createUncheckedException() throws ClassNotFoundException {
		try {
			Class.forName("fff");
		} catch (ClassNotFoundException e) {
			throw e;
		}
	}
	
	//Overloading methods will not have rules to declare Exceptions
	public void initializeCheckedException(String overload) throws Exception{
		createCheckedException();
	}
	
	public void initializeUnCheckedException(String overload) throws Exception {
		createUncheckedException();
	}
}
