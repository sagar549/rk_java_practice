package com.practice.basic.superKeyword;

class A {
	String name = "A"; 
	A()
	{
		System.out.println("A Constructor");
	}
	
	A(int par1) {
		System.out.println("A Constructor int par1");
	}
	
	A(long par1) {
		System.out.println("A Constructor long par1");
	}
	
	A(float par1) {
		System.out.println("A Constructor float par1");
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println("print A");
	}
}

class B extends A {
	String name = "B";
	B()
	{
		System.out.println("B Constructor");
	}
	
	B(int par1) {
		System.out.println("B Constructor int par1");
	}
	
	B(long par1) {
		System.out.println("B Constructor long par1");
	}
	
	B(float par1) {
		super(par1);
		System.out.println("B Constructor float par1");
	}
	
	public void print() {
		super.print();
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println("print B");
	}
}
	
class C extends B {
	String name = "C";
	C()
	{
		System.out.println("C Constructor");
	}
	
	C(int par1) {
		System.out.println("C Constructor int par1");
	}
	
	C(long par1) {
		super(par1);
		System.out.println("C Constructor long par1");
	}
	
	C(float par1) {
		super(par1);
		System.out.println("C Constructor float par1");
	}
	
	public void print() {
		super.print();
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println("print C");
	}
}
public class SuperKeyWord {
	public static void main(String args[]) {
		C c = new C();
		c.print();
		
		c = new C(1);
		
		c = new C(1l);
		
		c = new C(1f);
	}
}
