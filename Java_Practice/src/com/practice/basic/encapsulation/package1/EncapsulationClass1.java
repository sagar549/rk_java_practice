package com.practice.basic.encapsulation.package1;

import com.practice.basic.encapsulation.EncapsulationSubPackage;

public class EncapsulationClass1 {
	private int member1 = 1;
	int member2 = 2;
	protected int member3 = 3;
	public int member4 = 4;
	
	private void method1() {
		System.out.println("com.practice.basic.encapsulation.package1.EncapsulationClass1 method1 member1 : " + this.member1);
	}
	
	void method2() {
		method1();
		System.out.println("com.practice.basic.encapsulation.package1.EncapsulationClass1 method2");
	}
	
	protected void method3() {
		System.out.println("com.practice.basic.encapsulation.package1.EncapsulationClass1 method3");
	}
	
	public void method4() {
		System.out.println("com.practice.basic.encapsulation.package1.EncapsulationClass1 method4");
	}
	
	public static void main(String args[]) {
		EncapsulationChild encapsulationChild = new EncapsulationChild();
		encapsulationChild.printMembers();
		encapsulationChild.callMethods();
		
		EncapsulationAccessInsideClass encapsulationAccessInsideClass = new EncapsulationAccessInsideClass();
		encapsulationAccessInsideClass.printMembers();
		encapsulationAccessInsideClass.callMethods();
		
		EncapsulationSubPackageAggregation encapsulationSubPackageAggregation = new EncapsulationSubPackageAggregation();
		encapsulationSubPackageAggregation.printMembers();
		encapsulationSubPackageAggregation.callMethods();
		
		EncapsulationSubPackageInheritance encapsulationSubPackageInheritance = new EncapsulationSubPackageInheritance();
		encapsulationSubPackageInheritance.printMembers();
		encapsulationSubPackageInheritance.callMethods();
	}
}

class EncapsulationAccessInsideClass {
	
	private EncapsulationClass1 encapsulationClass1 = new EncapsulationClass1();
	
	public void printMembers() {
		System.out.println("member2 " + encapsulationClass1.member2 + " member3 " + encapsulationClass1.member3 + " member4 " + encapsulationClass1.member4 );
	}
	
	public void callMethods() {
		encapsulationClass1.method2();
		encapsulationClass1.method3();
		encapsulationClass1.method4();
	}
}

class EncapsulationChild extends EncapsulationClass1 {

	
	public void printMembers() {
		System.out.println("member2 " + super.member2 + " member3 " + super.member3 + " member4 " + super.member4 );
	}
	
	public void callMethods() {
		super.method2();
		super.method3();
		super.method4();
	}
}

class EncapsulationSubPackageAggregation {
	
	private EncapsulationSubPackage encapsulationSubPackage = new EncapsulationSubPackage();
	
	public void printMembers() {
		System.out.println(/*"member2 " + encapsulationSubPackage.member2 + " member3 " + encapsulationSubPackage.member3 + */" member4 " + encapsulationSubPackage.member4 );
	}
	
	public void callMethods() {
//		encapsulationSubPackage.method2();
//		encapsulationSubPackage.method3();
		encapsulationSubPackage.method4();
	}
}

class EncapsulationSubPackageInheritance extends EncapsulationSubPackage {

	
	public void printMembers() {
		System.out.println(/*"member2 " + super.member2 + */" member3 " + super.member3 + " member4 " + super.member4 );
	}
	
	public void callMethods() {
//		super.method2();
		super.method3();
		super.method4();
	}
}

