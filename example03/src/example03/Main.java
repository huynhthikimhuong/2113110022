package example03;

import example03.CRectangle;

public class Main 
{

	public static void main(String[] args) 
	{
		CRectangle rect = new CRectangle(3,4);
		CRectangle rectb = new CRectangle(5,6);
		
		
		System.out.println("rect a:" + rect.area());
		System.out.println("rect b:" + rectb.area());
	}

}
