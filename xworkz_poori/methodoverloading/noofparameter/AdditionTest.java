package com.xworkz_poori.methodoverloading.noofparameter;

public class AdditionTest {
	
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
	}

}