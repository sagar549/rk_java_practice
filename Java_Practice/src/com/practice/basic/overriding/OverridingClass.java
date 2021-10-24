package com.practice.basic.overriding;

class PrivateClass {
	
	//Cannot inherit this class
	private PrivateClass() {
		System.out.println("private constructor");
	}
	
	PrivateClass(int arg) {
		
	}
	
	public static PrivateClass createInstance() {
		return new PrivateClass();
	}
}

class OverridingParent extends PrivateClass{
	
	//Since default constructor is not visible, need to explicitly invoke another constructor
	OverridingParent() {
		super(1);
	}
	
	public int var = 20;

	public void run() {
		System.out.println("Parent");
		privatestaticMethod();
	}
	
	public static void runStatic() {
		System.out.println("Parent Static");
	}
	
	public static void main(String args[]) {
		System.out.println("Parent Main");
	}
	
	private static void privatestaticMethod() {
		System.out.println("Parent private static method");
	}
	
	void defaultInstanceMethod() {
		System.out.println("Parent default instance method");
	}
	
	static void defaultStaticMethod() {
		System.out.println("Parent default instance method");
	}
}
public class OverridingClass extends OverridingParent {
	
	public int var = 30;
	
	@Override
	public void run() {
		System.out.println("Child");
		privatestaticMethod();
	}
	
	//Although static, access modifier should be public(not more restrictive than parent class method)
	public static void runStatic() {
		System.out.println("Child Static");
	}
	
	//Not bothering with parent class method
	public static void privatestaticMethod() {
		System.out.println("Child private static method");
	}
	
	//Not Overriden because of change in arguments
	public void run(int par1) {
		System.out.println("Child run method with args");
	}
	
	//can be public and default also, but not private
	@Override
	protected void defaultInstanceMethod() {
		System.out.println("Child default instance method");
	}
	
	protected static void defaultStaticMethod() {
		System.out.println("Parent default instance method");
	}
	
	private static boolean flag = false;
	
	public static void main(String args[]) {
		if(flag)
			return ;
		flag = true;
		OverridingParent overridingParent = new OverridingParent();
		overridingParent.run();
		overridingParent.runStatic();
		overridingParent.main(args);
		System.out.println("overridingParent instanceof OverridingParent : " + (overridingParent instanceof OverridingParent));
		System.out.println("overridingParent instanceof OverridingClass : " + (overridingParent instanceof OverridingClass));
		System.out.println(overridingParent.var);
		OverridingParent overridingParentChild = new OverridingClass();
		overridingParentChild.run();
		overridingParentChild.runStatic();
		overridingParentChild.main(args);
		System.out.println("overridingParentChild instanceof OverridingParent : " + (overridingParentChild instanceof OverridingParent));
		System.out.println("overridingParentChild instanceof OverridingClass : " + (overridingParentChild instanceof OverridingClass));
		//Run-time polymorphism not applicable to data members
		System.out.println(overridingParentChild.var);
		OverridingClass overridingChild = new OverridingClass();
		overridingChild.run();
		overridingChild.run(0);
		overridingChild.runStatic();
		overridingChild.main(args);
		System.out.println(overridingChild.var);
		System.out.println("overridingChild instanceof OverridingParent : " + (overridingChild instanceof OverridingParent));
		System.out.println("overridingChild instanceof OverridingClass : " + (overridingChild instanceof OverridingClass));
	}
}
