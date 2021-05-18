package com.hs.s1;

public class Member {

	private int id;  
	private int pw;
	private String name;
	
	//Data를 입력 하는것은 set변수명
	public void setId(int id) {
		
		this.id = id;
	}
	
	//Data를 입력 하는것은 get변수명
	public int getId() {
		return this.id;
	}
	
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	public int getPw() {
		return this.pw;
	}
}
