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
	 * ������������ ������� ������ �����
	 * @param int len
	 */
	public void setLen(int len)
	{
		this.len = len;
	}
	
	/**
	 * ������������ ���� ��������
	 * @param STRING color
	 */
	public void setLipColor(String color)
	{
		this.LipsColor = color;
	}
	
	/**
	 * ���������� ������� �����
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
	 * ���������� ������ �����
	 * @param int condition
	 */
	public void setCondition(int condition)
	{
		this.condition = condition;
	}
	/**
	 * ������ ������� ������ �����
	 * @return float
	 */
	public int getLen()
	{
		return this.len;
	}
	
	/**
	 * ������� ���� ��������
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
		return "������� ����� ���������: " +this.price+"\n"+"���� ��������: " +this.LipsColor+"\n"+"������� ������: " +this.len+"\n"+"�������� �������� ������: " + this.isGoodSmell+"\n"+"����: "+this.condition;
	}
	
}
