package com.practice.collections.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 420;
	}
}
public class HashsetExample {
	public static void main(String args[]) {
		Person p1 = new Person("name1");
		Person p2 = new Person("name1");
		Set<Person> hashSet = new HashSet<Person>();
		hashSet.add(p1);
		hashSet.add(p2);
		System.out.println("hashSet " + hashSet.toString());
		
		Map<Person, String> hashMap = new HashMap<Person, String>();
		hashMap.put(p1, "s1");
		hashMap.put(p2, "s2");
		System.out.println("hashMap " + hashMap.toString());
		hashMap.remove(p1);
		System.out.println("hashMap " + hashMap.toString());
	}
}
