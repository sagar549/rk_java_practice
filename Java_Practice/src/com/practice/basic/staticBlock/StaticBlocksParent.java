package com.practice.basic.staticBlock;

public class StaticBlocksParent {
	
	StaticBlocksParent(String arg1) {
		System.out.println("StaticBlocksParent Constructor with arg1 " + arg1);
	}
	
	StaticBlocksParent() {
		System.out.println("StaticBlocksParent Constructor");
	}
	
	{
		System.out.println("StaticBlocksParent Normal Block 1");
	}
	
	{
		System.out.println("StaticBlocksParent Normal Block 2");
	}
	
	static {
		System.out.println("StaticBlocksParent Inside static block - 1");
	}
	
	static {
		System.out.println("StaticBlocksParent Inside static block - 2");
	}
	
	static {
		System.out.println("StaticBlocksParent Inside static block - 3");
	}
	
	public static void staticMethod() {
		System.out.println("StaticBlocksParent static Method");
	}
	
	public void instanceMethod() {
		System.out.println("StaticBlocksParent instance Method");
	}
}
