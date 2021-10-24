package com.practice.basic.covariant;

class A1  
{
	A1 defaultReturnType() {
		System.out.println("Inside the class A1");
		return this;
	}
	
    A1 covarinatReturnType()  
    {  
    	System.out.println("Inside the class A1");
        return this;  
    }  
    
    Number intMethod(Number par1) {
    	return par1;
    }
    
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
    
    static void printStatic() {
    	System.out.println("printStatic Inside the class A1");
    }
}  
  
  
// A2 is the child class of A1  
class A2 extends A1  
{  
	@Override
	A1 defaultReturnType() {
		System.out.println("Inside the class A2");
		return this;
	}
	
    @Override  
    A2 covarinatReturnType()  
    {  
    	System.out.println("Inside the class A2");
        return this;  
    }  
      
    Integer intMethod(Number par1) {
    	return par1.intValue();
    }
    
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
    
    static void printStatic() {
    	System.out.println("printStatic Inside the class A2");
    }
}  
  
// A3 is the child class of A2  
class A3 extends A1 
{  
	@Override
	A1 defaultReturnType() {
		System.out.println("Inside the class A3");
		return this;
	}
	
    @Override  
    A3 covarinatReturnType()  
    {  
    	System.out.println("Inside the class A3");
        return this;  
    }  
      
    Long intMethod(Number par1) {
    	return par1.longValue();
    }
    
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
    
    static void printStatic() {
    	System.out.println("printStatic Inside the class A3");
    }
}  

public class CovariantReturnTypes {
	
	public static void main(String args[]) {		
		A1 a1 = new A1();
		a1.defaultReturnType().print();
		a1.covarinatReturnType().print();
		a1.defaultReturnType().printStatic();
		a1.covarinatReturnType().printStatic();
		System.out.println(a1.intMethod((byte)10).getClass().getName());
		System.out.println(a1.intMethod((short)10).getClass().getName());
		System.out.println(a1.intMethod(10).getClass().getName());
		System.out.println(a1.intMethod(Long.MAX_VALUE).getClass().getName());
		System.out.println(a1.intMethod(10.5f).getClass().getName());
		System.out.println(a1.intMethod(10.5d).getClass().getName());
		A2 a2 = new A2();
		a2.defaultReturnType().print();
		a2.covarinatReturnType().print();
		a2.defaultReturnType().printStatic();
		a2.covarinatReturnType().printStatic();
		System.out.println(a2.intMethod(10).getClass().getName());
		A3 a3 = new A3();
		a3.defaultReturnType().print();
		a3.covarinatReturnType().print();
		a3.defaultReturnType().printStatic();
		a3.covarinatReturnType().printStatic();
		System.out.println(a3.intMethod(10.0d).getClass().getName());
	}
	
}
