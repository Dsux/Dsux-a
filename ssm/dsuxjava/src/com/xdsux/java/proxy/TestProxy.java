package com.xdsux.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		//某学生
		Student stu = new Student();
        
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(stu);
        
        //创建一个代理对象stuProxy来代理某学生，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
       //代理执行上交班费的方法
        stuProxy.giveMoney();
	}
}
