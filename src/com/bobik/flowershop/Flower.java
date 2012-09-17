package com.bobik.flowershop;

public abstract class Flower {
	int len;
	String LipsColor;
	float price;
	boolean isGoodSmell;
	int condition = 10;
	
	/**
	 * Default constructor
	 */
	Flower ()
	{}
	/**
	 * 
	 * @param int len
	 * @param String LipsColor
	 * @param float d
	 * @param boolean isGoodSmell
	 * @param int condition
	 */
	Flower (int len, String LipsColor, float d, boolean isGoodSmell, int cond)
	{
		this.len = len;
		this.LipsColor = LipsColor;
		this.price = d;
		this.isGoodSmell = isGoodSmell;
		this.condition = cond;
	}
	/**
	 * Встановлюємо довжину стебла квітки
	 * @param int len
	 */
	public void setLen(int len)
	{
		this.len = len;
	}
	
	/**
	 * встановлюємо колір листочків
	 * @param STRING color
	 */
	public void setLipColor(String color)
	{
		this.LipsColor = color;
	}
	
	/**
	 * Встановлює вартість квітки
	 * @param float p
	 */
	public void setSmell(boolean smell)
	{
		this.isGoodSmell = smell;
	}
	
	/**
	 * 
	 * @param p
	 */
	public void setPrice(float p)
	{
		this.price = p;
	}
	/**
	 * Встановлює свіжість квітки
	 * @param int condition
	 */
	public void setCondition(int condition)
	{
		this.condition = condition;
	}
	/**
	 * Повртає довжину стебла квітки
	 * @return float
	 */
	public int getLen()
	{
		return this.len;
	}
	
	/**
	 * Повертає колір липистків
	 * @return
	 */
	public String getLipsColor()
	{
		return this.LipsColor;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getCondition()
	{
		return this.condition;
	}
	public String toString()
	{
		return "Вартість квітки становить: " +this.price+"\n"+"Колір липистків: " +this.LipsColor+"\n"+"Довжина стебла: " +this.len+"\n"+"Наявність приємного запаху: " + this.isGoodSmell+"\n"+"Стан: "+this.condition;
	}
	
}
