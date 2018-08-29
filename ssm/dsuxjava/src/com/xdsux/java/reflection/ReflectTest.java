package com.xdsux.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ReflectTest {
	
	private int num1;
	private String s1;
	private ArrayList<String> l1;
	
	public ReflectTest() {
		this.num1 = 3;
		this.s1 = "test1";
		this.l1 = new ArrayList<String>();
	}
	
	public ReflectTest(int num1, String s1) {
		this.num1 = 3;
		this.s1 = "test1";
		this.l1 = new ArrayList<String>();
		l1.add("" + num1);
		l1.add(s1);
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public ArrayList<String> getL1() {
		return l1;
	}

	public void setL1(ArrayList<String> l1) {
		this.l1 = l1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReflectTest rt = new ReflectTest();
		
		rt.testRef3();
	}
	
	public void testRef1() {
		try {
			//根据类名获取类信息
			String className = "com.xdsux.java.reflection.ReflectTest";
			Class<?> tr1 = Class.forName(className);
			//第一种方式,首选
			System.out.println(tr1.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		Class<?> tr2 = new ReflectTest().getClass();
		Class<?> tr3 = ReflectTest.class;
		//第二种方式
		System.out.println(tr2.getName());
		//第三种方式
		System.out.println(tr3.getName());
	}
	
	//通过反射实例化类
	public void testRef2() {
		Class<?> cl =null;
		ReflectTest rt = null;
		try {
			cl = Class.forName("com.xdsux.java.reflection.ReflectTest");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rt = (ReflectTest)cl.newInstance();
			System.out.println(rt.num1);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	public void testRef3() {
		Class<?> cl =null;
		ReflectTest rt = null;
		try {
			cl = Class.forName("com.xdsux.java.reflection.ReflectTest");
			rt = (ReflectTest)cl.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//获取类信息中全部属性，也可以通过传参获取指定属性
		Field[] fields = cl.getDeclaredFields();
		for (Field fd : fields) {
			System.out.println("属性修饰符: " + Modifier.toString(fd.getModifiers()));
			System.out.println("属性名：" + fd.getName());
			System.out.println("属性类型" + fd.getType());
		}
		try {
			//获取set方法
			Method md = cl.getMethod("setNum1", int.class);
			//调用set方法,注意这里第一个传参rt是类的实例，不是类信息的类cl
			md.invoke(rt, 4);
			//获取get方法
			md =cl.getMethod("getNum1");
			System.out.println("获取修改过的num1属性：" + md.invoke(rt));
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
}

