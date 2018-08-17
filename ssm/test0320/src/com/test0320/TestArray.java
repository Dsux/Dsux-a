package com.test0320;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArray {

	private int a;

	public static void main(String[] args) {
/*		int[] arrayA;
		arrayA = new int[5];

		// 对象里的数据有默认值，数据为对象时，默认值时null
		System.out.println(arrayA[4]);

		// toString返回的是数字的地址？
		System.out.println(arrayA.toString());

		arrayA[0] = 1;
		System.out.println(arrayA.toString());
		String s = new String("s");
		String ss = new String("S");
		ssOut(s, ss);
		char[] x = null;
		InnerClass innerClass = new InnerClass();
		System.out.println(x);
		System.err.println(innerClass.getClass());*/
		
		List<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(null);
		System.out.println(x);
		System.out.println(x.size());
		Iterator<Integer> xi = x.iterator();
		//display(xi);
		List<Integer> x2 = x.subList(2, 4);
		x2.set(1, 33);
		System.out.println(x.get(0).hashCode());
	}

	public static <T> void display(Iterator<T> it)
	{
		while(it.hasNext())
		{
			T t = it.next();
			System.out.println(t.getClass().getName() + ":" + t);
		}
	}
	private static void ssOut(String s, String ss) {
		System.out.println(s == ss);
		System.out.println(s == ss);
		
		System.out.println(s == ss);
		System.out.println(s == ss);
		System.out.println(s == ss);
	}

	public TestArray() {
		super();
		// TODO Auto-generated constructor stub
	}
}
