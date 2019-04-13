package com.usa.smarttech;

public class Account {
	int previousbalance;
	int add = 100;
	int withdrawl =500;
	int newbalance ;
	
	Account(int previousbalance){
		this.previousbalance=previousbalance;
		
	}
	
	void add() {
		newbalance=previousbalance+add;
		System.out.println(newbalance);
	}
	void withdraw() {
		int finalbalance= newbalance-withdrawl;
		System.out.println(finalbalance);
	}
	

}
