package com.test0320;


public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Egg[] eggs = new Egg[5];
		eggs[0] = new Egg(1,1);
		eggs[2] = new Egg(2,3);
		eggs[3] = new Egg(3,5);
		eggs[4] = new Egg(4,7);
		System.out.println(eggs[0]);
		Egg[] eggs2 = new Egg[5];
		System.arraycopy(eggs, 0, eggs2, 0, 4);
		System.out.println(eggs2[0]);
	}

}

class Egg {
	
	int eggIndex;
	int eggPrice;
	
	public Egg(int eggIndex, int eggPrice)
	{
		this.eggIndex = eggIndex;
		this.eggPrice = eggPrice;
	}
}
