package com.practice.basic.generics;

class Car<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
}

public class GenericsClass {
	Car<String> cString = new Car<>();
	Car c = cString
;}
