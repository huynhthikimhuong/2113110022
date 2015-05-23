package example04;

class CRectangle 
{
	int width;
	int height;
	public CRectangle (int a,int b)
	{
		width = a;
		height = b;
	}
	public int area()
	{
		return (width*height);
	}
public static void Main(String[]args)
{
	CRectangle recta = new CRectangle(3,4);
	CRectangle rectb = new CRectangle(5,6);
	rectb=recta;
	System.out.println("rect a:" + recta.area());
	System.out.println("rect b:" + rectb.area());
	
}
}