package com.xworkz_poori.polymorpsim;

public class MethodOverridingDemo {
	
	public static void main(String[] args){
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
	
		System.out.println(rbi.getIntrestRate());		
		System.out.println(sbi.getIntrestRate());
		System.out.println(hdfc.getIntrestRate());

	}
}
