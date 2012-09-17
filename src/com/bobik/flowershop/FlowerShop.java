package com.bobik.flowershop;

import java.util.Random;

public class FlowerShop {
	private float makeBucketCoast = 20.55f;
	public final String VAL = "ÃÐÍ";
	public final int PDV = 20;
	
	public Flower makeRandomFlower()
	{
		Random r = new Random ();
		Flower f;
		switch(r.nextInt(4))
		{
			default:
			case 0:
				f = new TeaRose();
				break;
			case 1:
				f =  new ParkRose();
				break;
			case 2: 
				f = new MiniRose();
				break;
			case 3: 
				f =  new DecoDaisy();
				break;
			case 4: 
				f = new Cornflower();
				break;
				
		}
		return f;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			FlowerShop fshop = new FlowerShop();
			Flower q = fshop.makeRandomFlower();
			q.setCondition(10);
			q.setLen(30);
			q.setLipColor("green");
			q.setPrice(40.00f);
			q.setSmell(true);
			System.out.println(q);
			System.out.println(q.getPrice());
			System.out.println(q.getLipsColor());
			System.out.println(q.getLen());
			System.out.println(q.getCondition());
			System.out.println(q.getClass().getCanonicalName());
	}

}
