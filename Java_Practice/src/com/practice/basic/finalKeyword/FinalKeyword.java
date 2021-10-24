package com.practice.basic.finalKeyword;

//Cannot inherit this class
final class FinalClass {
	
//	methods can or cannot be final, will have minimal impact on performance since we cannot guarantee that in a final class final methods are inlined on priority, 
//	it may have have a difference if there is a final method in non-final class
	public void run() {
		System.out.println("FinalClass run method");
	}
	
	final public void finalRun() {
		System.out.println("FinalClass final run method");
	}
}

class FinalMethodClass {
	final void run() {
		System.out.println("FinalMethodClass run method");
	}
}
public class FinalKeyword extends FinalMethodClass {

	private final int final1 = 20;
	private final int final2;
	private static final int staticFinal1 = 40;
	private static final int staticFinal2;
	
	static {
		staticFinal2 = 50;
		System.out.println("staticFinal2 : " + staticFinal2);
//		Below is not possible
//		staticFinal2 = 60;
	}
	
	FinalKeyword() {
		this.final2 = 30;
		System.out.println("final2 : " + final2);
//		Below is not possible
//		this.final2 = 40;
	}
	
	public int incrementAndReturn(final int n) {
//		Below is not possible
//		return n++;
		return n+1;
	}

//	Cannot Override final method class
//	@Override
//	public void run() {
//		System.out.println("FinalMethodClass run method");
//	}
	
	public static void main(String args[]) {
		FinalKeyword finalKeyword = new FinalKeyword();
		System.out.println("final1 : " + finalKeyword.final1);
		System.out.println("staticFinal1 : " + finalKeyword.staticFinal1);
//		Below is not possible
//		finalKeyword.final1 = 40;
//		finalKeyword.staticFinal1 = 60;
		System.out.println(finalKeyword.incrementAndReturn(20));
		finalKeyword.run();
		
		FinalClass finalClass = new FinalClass();
		finalClass.run();
		finalClass.finalRun();
	}
}
