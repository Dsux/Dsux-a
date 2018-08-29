package com.xdsux.java.proxy;

public class Student implements Person {

	@Override
	public void giveMoney() {
		try {
			// 假设数钱花了一秒时间
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("学生提交班费：50");

	}

}
