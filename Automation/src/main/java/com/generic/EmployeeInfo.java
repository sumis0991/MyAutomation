package com.generic;

public class EmployeeInfo {
	
	
	String name;
	String getname(){
		
	name="smarttech";
		
		return"your name::"+name;
		
	
	}

	
	public static void main(String[] args) {
		
		EmployeeInfo obj= new EmployeeInfo();
		String a=obj.getname();
		System.out.println(a);
		
	}		
			
		
	}


