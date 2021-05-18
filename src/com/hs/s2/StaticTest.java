package com.hs.s2;

public class StaticTest {

	public static int num=10; //클래스변수, static영역
	
	public String name="messi"; //인스턴스변수, heap
	
	//Class Method - Static영역
	public static void staticInfo() {
		double point=1.1;		//지역변수, stack
		System.out.println("Static Method");
		System.out.println(StaticTest.num);
//		System.out.println(this.name);
//		this.instanceInfo();
	}
	
	//Instance Method - Heap영역
	public void instanceInfo() {
		System.out.println("Instance Method");
		System.out.println(this.name);
		System.out.println(StaticTest.num);
		StaticTest.staticInfo();
	}
	
}
