package com.test0320;

public class InnerClass {
	
	//变量
	String varA = "variable";
	
	//静态变量
	static String varB = "static var";
	
	//非静态内部类
	class TestInner {
		
		//内部变量
		String varA = "innerVarA";
		
		//获取和返回varA的值
		public String getVarA() {
			return varA;
		}

		public void setVarA(String varA) {
			this.varA = varA;
		}
		
		//内部静态变量,不许允创建
		//static String varB = "";
		
		//内部类访问自己的属性和访问外部类的属性
		public void changeVarA()
		{
			//改变前
			System.out.println(varA);
			this.varA = InnerClass.this.varA;
			//改变后
			System.out.println(varA);
		}
	}
	
	//静态内部类
	static class TestStaticInner {
		
		static String varA = "innerStaticA";
		
		String varB = "innerVarB";
	}

	public static void main(String[] args) {
		
		//test
		InnerClass innerClass = new InnerClass();
		
		//修改外部类的属性值
		innerClass.varA = "ChangeOuterVarA";
		
		//创建内部类
		InnerClass.TestInner testInner = innerClass.new TestInner();
		
		//外部类是否能直接访问内部类的属性: 可以
		/*	testInner.varA = "x";
		System.out.println(testInner.varA);*/
		
		//内部类直接访问外部类的属性：可以
		testInner.changeVarA();
		
		//访问静态内部类的静态成员：
		System.out.println(InnerClass.TestStaticInner.varA);
	}

}
