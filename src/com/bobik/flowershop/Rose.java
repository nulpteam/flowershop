package com.bobik.flowershop;

import java.util.Random;

class Rose extends Flower {
	private int thornCount;
	private boolean isThorns = false;
	Rose()
	{
		this.isThorns=true;
		this.thornCount = new Random().nextInt(100);
	}
	public int getThornsCount()
	{
		return this.thornCount;
	}
	public boolean isThorns()
	{
		return this.isThorns;
	}
}
