package com.practice.basic.encapsulation.package1;

//class EncapsulationAccessInsideClass {
//	
//	private EncapsulationClass1 encapsulationClass1 = new EncapsulationClass1();
//	
//	public void printMembers() {
//		System.out.println("member2 " + encapsulationClass1.member2 + " member3 " + encapsulationClass1.member3 + " member4 " + encapsulationClass1.member4 );
//	}
//	
//	public void callMethods() {
//		encapsulationClass1.method2();
//		encapsulationClass1.method3();
//		encapsulationClass1.method4();
//	}
//}
//
//class EncapsulationChild extends EncapsulationClass1 {
//
//	
//	public void printMembers() {
//		System.out.println("member2 " + super.member2 + " member3 " + super.member3 + " member4 " + super.member4 );
//	}
//	
//	public void callMethods() {
//		super.method2();
//		super.method3();
//		super.method4();
//	}
//}

public class EncapsulationClassSamePackage {

	public static void main(String args[]) {
		EncapsulationSubPackageInheritance encapsulationChild = new EncapsulationSubPackageInheritance();
		encapsulationChild.printMembers();
		encapsulationChild.callMethods();
		
		EncapsulationSubPackageAggregation encapsulationAccessInsideClass = new EncapsulationSubPackageAggregation();
		encapsulationAccessInsideClass.printMembers();
		encapsulationAccessInsideClass.callMethods();
	}
}
