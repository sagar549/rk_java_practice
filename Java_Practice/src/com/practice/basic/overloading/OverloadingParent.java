package com.practice.basic.overloading;

public class OverloadingParent {
	
	public int overLoadMethod(int par1, int par2) {
		System.out.println("overLoadMethod int par1, int par2");
		return par1 + par2;
	}
	
	public int overLoadMethod(int par1, int par2, int par3) {
		System.out.println("overLoadMethod int par1, int par2, int par3");
		return par1 + par2 + par3;
	}

	public double overLoadMethod(double par1, double par2) {
		System.out.println("overLoadMethod double par1, double par2");
		return par1 + par2;
	}
	
	public double overLoadMethod(int par1, double par2) {
		System.out.println("overLoadMethod int par1, double par2");
		return par1 + par2;
	}
	
	public double overLoadMethod(double par1, int par2) {
		System.out.println("overLoadMethod double par1, int par2");
		return par1 + par2;
	}
	
	public int overLoadMethod(byte par1, byte par2) {
		System.out.println("overLoadMethod byte par1, byte par2");
		return par1 + par2;
	}
	
	public int overLoadMethod(short par1, short par2) {
		System.out.println("overLoadMethod byte par1, byte par2");
		return par1 + par2;
	}
	
	public float overLoadMethod(float par1, float par2) {
		System.out.println("overLoadMethod float par1, float par2");
		return par1 + par2;
	}
	
	public float overLoadFloatMethod(float par1, float par2) {
		System.out.println("overLoadFloatMethod float par1, float par2");
		return par1 + par2;		
	}
	
	public int overLoadByteMethod(byte par1, byte par2) {
		System.out.println("overLoadByteMethod byte par1, byte par2");
		return par1 + par2;
	}
	
	public int overLoadByteIntMethod(byte par1, int par2) {
		System.out.println("overLoadByteIntMethod byte par1, int par2");
		return par1 + par2;
	}
	
	public int overLoadByteIntMethod(int par1, byte par2) {
		System.out.println("overLoadByteIntMethod int par1, byte par2");
		return par1 + par2;
	}
	
	public long overLoadLongFloatDouble(long par1, long par2) {
		System.out.println("overLoadLongFloatDouble long par1, long par2");
		return par1 + par2;
	}
	
	public float overLoadLongFloatDouble(float par1, float par2) {
		System.out.println("overLoadLongFloatDouble float par1, float par2");
		return par1 + par2;
	}
	
	public double overLoadLongFloatDouble(double par1, double par2) {
		System.out.println("overLoadLongFloatDouble double par1, double par2");
		return par1 + par2;
	}
	
	public static void main(String args[]) {
		OverloadingParent overLoadingParent = new OverloadingParent();
		System.out.println(overLoadingParent.overLoadMethod(10, 20));
		System.out.println(overLoadingParent.overLoadMethod(10, 20, 30));
		System.out.println(overLoadingParent.overLoadMethod(10.5, 20));
		System.out.println(overLoadingParent.overLoadMethod(10, 20.5));
		System.out.println(overLoadingParent.overLoadMethod(10.5, 20.5));
		System.out.println(overLoadingParent.overLoadMethod(1, 2));
		System.out.println(overLoadingParent.overLoadFloatMethod(10.5f, 20.5f));
		System.out.println(overLoadingParent.overLoadFloatMethod(10, 20));
		System.out.println(overLoadingParent.overLoadByteMethod((byte)1, (byte)2));
		byte b1 = 1, b2 =2;
		System.out.println(overLoadingParent.overLoadMethod(b1, 2));
		System.out.println(overLoadingParent.overLoadMethod(1, b2));
		System.out.println(overLoadingParent.overLoadMethod(b1, b2));
		System.out.println(overLoadingParent.overLoadByteMethod(b1, b2));
		System.out.println(overLoadingParent.overLoadByteIntMethod(b1, 2));
		System.out.println(overLoadingParent.overLoadByteIntMethod(1, b2));
		System.out.println(overLoadingParent.overLoadMethod('A', 'B'));
		System.out.println(overLoadingParent.overLoadFloatMethod('A', 'B'));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(b1, b2));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(b1, 10.5d));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(10.5d, b2));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(b1, 10.5f));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(10.5f, b2));
		System.out.println(overLoadingParent.overLoadLongFloatDouble('A', 'B'));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(10, 20));
		short s1 = 1, s2 = 2;
		System.out.println(overLoadingParent.overLoadLongFloatDouble(s1, s2));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(s1, 10.5));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(10.5, s2));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(s1, 10));
		System.out.println(overLoadingParent.overLoadLongFloatDouble(10, s2));
	}
}
