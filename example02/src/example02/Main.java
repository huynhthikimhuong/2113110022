package example02;

public class Main 
{

	public static void main(String[] args) 
	{
		CRectangle rect = new CRectangle();
		CRectangle rectb = new CRectangle();
		rect.setValues(3, 4);
		rect.setValues(5,6);
		
		System.out.println("rect a:" + rect.area());
		System.out.println("rect b:" + rectb.area());
	}

}
