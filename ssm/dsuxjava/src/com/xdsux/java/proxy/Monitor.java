package com.xdsux.java.proxy;

public class Monitor implements Person {
	//班长即代理，持有学生实例
	Student stu;
	
	public Monitor(Person stu) {
		this.stu = (Student)stu;
	}

	@Override
	public void giveMoney() {
		//班长叫学生交班费
		stu.giveMoney();
	}
}
