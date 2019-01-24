package com.bean;

public class student {
	int roll;
	String name;
	String[] cor;
	int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getCor() {
		return cor;
	}

	public void setCor(String[] cor) {
		this.cor = cor;
	}

	public student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	

}
