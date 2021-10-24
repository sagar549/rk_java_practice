package com.practice.basic.staticBlock;

class StaticBlocksChild extends StaticBlocksParent {
	
	StaticBlocksChild(String arg1) {
		super(arg1);
		System.out.println("StaticBlocksChild Constructor with arg1 " + arg1);
	}
	
	StaticBlocksChild() {
		System.out.println("StaticBlocksChild Constructor");
	}
	
	public static void staticMethod() {
		System.out.println("StaticBlocksChild static Method");
	}
	
	public void instanceMethod() {
		System.out.println("StaticBlocksChild instance Method");
	}
	
	{
		System.out.println("StaticBlocksChild Normal Block 1");
	}
	
	{
		System.out.println("StaticBlocksChild Normal Block 2");
	}
	
	static {
		System.out.println("StaticBlocksChild Inside static block - 1");
	}
	
	static {
		System.out.println("StaticBlocksChild Inside static block - 2");
	}
	
	static {
		System.out.println("StaticBlocksChild Inside static block - 3");
	}
	
	public static void main(String args[]) {
		
		StaticBlocksChild staicBlocksChild = new StaticBlocksChild();
		staicBlocksChild.instanceMethod();
		staicBlocksChild.staticMethod();
		
		StaticBlocksParent staicBlocksParentwithChild =  new StaticBlocksChild();
		staicBlocksParentwithChild.instanceMethod();
		staicBlocksParentwithChild.staticMethod();
		
		StaticBlocksParent staicBlocksParent =  new StaticBlocksParent();
		staicBlocksParent.instanceMethod();
		staicBlocksParent.staticMethod();
		
		StaticBlocksParent staticBlocksParentTypeCast = (StaticBlocksParent)staicBlocksParentwithChild;
		staticBlocksParentTypeCast.instanceMethod();
		staticBlocksParentTypeCast.staticMethod();
		
		StaticBlocksChild staicBlocksChildWithArgs1 = new StaticBlocksChild("childarg1");
		
		StaticBlocksParent staicBlocksParentwithChildArg1 =  new StaticBlocksChild("childarg1parent");
	}
}