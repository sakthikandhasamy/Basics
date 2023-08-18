package com.basic.pkg;

public class Alcazer {
	int exshowroomprice;
	int tcs;
	int insurance;
	int regfee;
	static final int fastag=500;
	static final int bap=14999;
	int onroadprice;
	
	public Alcazer(int exshowroomprice, int tcs, int insurance, int regfee) {
		this.exshowroomprice = exshowroomprice;
		this.tcs = tcs;
		this.insurance = insurance;
		this.regfee = regfee;
		//this.onroadprice=onroadprice;
	}
	int calculateonroadprice()
	{
		onroadprice=exshowroomprice+tcs+ insurance+ regfee+ fastag+bap;
		System.out.println("On Road Price : "+onroadprice);
		return onroadprice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alcazer prestige1_5_7str=new Alcazer(1677500,16775,69501,25905);
		prestige1_5_7str.calculateonroadprice();

	}

}
