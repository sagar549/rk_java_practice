package com.practice.basic.abstraction;

interface InterfaceParent {
	int interfaceMember = 40;
	void interfaceMethod();
	
	void interfaceMethodWithArgs(int par1);
	
	default void defaultMethod() {
		System.out.println("InterfaceParent default method");
	}
	
	default void defaultMethodWithArgs(int par1) {
		System.out.println("InterfaceParent default methodwithargs " + par1);
	}
	
	static void staticMethod() {
		System.out.println("InterfaceParent staticMethod");
	}
	
	static void staticMethodWithArgs(int par1) {
		System.out.println("InterfaceParent staticMethodWithArgs " + par1);
	}
}

interface InterfaceChild extends InterfaceParent{
	int interfaceMember = 40;
	void interfaceMethod();
	
	void interfaceMethodWithArgs(int par1);
	
	default void defaultMethod() {
		System.out.println("InterfaceChild default method");
	}
	
	default void defaultMethodWithArgs(int par1) {
		System.out.println("InterfaceChild default methodwithargs " + par1);
	}
	
	static void staticMethod() {
		System.out.println("InterfaceChild staticMethod");
	}
	
	static void staticMethodWithArgs(int par1) {
		System.out.println("InterfaceChild staticMethodWithArgs " + par1);
	}
}

public abstract class AbstractClass implements InterfaceChild{

	public int abstractMember = 20;
	
	AbstractClass() {
		System.out.println("AbstractClass Constructor");
	}
	
	@Override
	public void interfaceMethod() {
		System.out.println("Implemented interfaceMethod in AbstractClass");
	}
	
	@Override
	public void interfaceMethodWithArgs(int par1) {
		System.out.println("interfaceMethodWithArgs in AbstractClass " + par1);
	}
	
	@Override
	public void defaultMethod() {
		InterfaceChild.super.defaultMethod();
		System.out.println("Interface default method AbstractClass");
	}
	
	@Override
	public void defaultMethodWithArgs(int par1) {
		InterfaceChild.super.defaultMethodWithArgs(par1);
		System.out.println("Interface default methodwithargs AbstractClass " + par1);
	}
	
	//Need to declare class as abstract to declare a abstract method
	abstract void abstractMethod();
	
	void normalMethod() {
		System.out.println("AbstractClass normalMethod");
	}
	
	final void finalMethod() {
		System.out.println("AbstractClass finalMethod");
	}
	
	static void staticMethod() {
		System.out.println("AbstractClass staticMethod");
	}
	
	public static void main(String args[]) {
//		Cannot create an instance for a abstract class
//		AbstractClass abstractClass = new AbstractClass();
		AbstractClass abstractChildClass = new ChildClass();
		System.out.println("abstractChildClass.abstractMember " + abstractChildClass.abstractMember);
		abstractChildClass.abstractMethod();
		abstractChildClass.normalMethod();
		abstractChildClass.finalMethod();
		abstractChildClass.staticMethod();
		abstractChildClass.interfaceMethod();
		abstractChildClass.interfaceMethodWithArgs(interfaceMember);
		abstractChildClass.defaultMethod();
		abstractChildClass.defaultMethodWithArgs(interfaceMember);
		InterfaceParent.staticMethod();
		InterfaceParent.staticMethodWithArgs(interfaceMember);
		
		
		ChildClass childClass = new ChildClass();
		System.out.println("abstractChildClass.abstractMember " + childClass.abstractMember);
		childClass.abstractMethod();
		childClass.normalMethod();
		childClass.finalMethod();
		childClass.staticMethod();
		childClass.interfaceMethod();
		childClass.interfaceMethodWithArgs(interfaceMember);
		childClass.defaultMethod();
		childClass.defaultMethodWithArgs(interfaceMember);
		
	}
}

class ChildClass extends AbstractClass {

	public int abstractMember = 30;
	
	ChildClass() {
		System.out.println("ChildClass Constructor");
	}
	@Override
	void abstractMethod() {
		System.out.println("Implemented abstractMethod in Child Class");
	}

//	Cannot override final method even from a abstract class
//	void finalMethod() {
//		
//	}
	
	@Override
	public void defaultMethod() {
		super.defaultMethod();
		System.out.println("Interface default method ChildClass");
	}
	
	@Override
	public void defaultMethodWithArgs(int par1) {
		super.defaultMethodWithArgs(par1);
		System.out.println("Interface default methodwithargs ChildClass " + par1);
	}
	
	void normalMethod() {
		super.normalMethod();
		System.out.println("ChildClass normalMethod");
	}
	
	static void staticMethod() {
		System.out.println("ChildClass staticMethod");
	}
	
	@Override
	public void interfaceMethod() {
		super.interfaceMethod();
		System.out.println("Implemented interfaceMethod in ChildClass");
	}
	
	@Override
	public void interfaceMethodWithArgs(int par1) {
		super.interfaceMethodWithArgs(par1);
		System.out.println("interfaceMethodWithArgs in ChildClass " + par1);
	}
}
