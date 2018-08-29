package com.xdusx.java.strategy;

public class Strategy {
	
	//策略模式
	public static void main(String[] args) {
		
		//运行时，有主管点名的员工确定报告工作的内容
		new Man().getEnpReport(new Enp1());
	}

}

interface GetWorkStatement {
	//定义一个策略，该策略返回员工的工作报告，每个员工有不同的工作内容，故每个员工对策略有不同的实现
	String getWorkStatement();
}

//第一类员工
class Enp1 implements GetWorkStatement {
	public String getWorkStatement() {
		return "enp1 status";
	}
}

//第二类员工
class Enp2 implements GetWorkStatement {
	public String getWorkStatement() {
		return "enp2 status";
	}
}

//第三类员工
class Enp3 implements GetWorkStatement {
	private String s1 = "xx";
	public String getS1() {
		return s1;
	}
	public String getWorkStatement() {
		return "enp3 status";
	}
}

class Enp4 extends Enp3 {
	void changeS1(){
		System.err.println(getS1());
	}
	
}

//主管，负责指定一个员工抽查工作报告。抽查的员工在运行时决定，工作报告的内容由员工自行决定
class Man{
	
	void getEnpReport(GetWorkStatement enpReport){
		Class s = enpReport.getClass();
		System.out.println(s.getName());
		System.out.println(enpReport.getWorkStatement());
	}
}