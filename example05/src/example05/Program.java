package example05;

public class Program {

	public static void main(String[] args) {
	Rectangle rect=new Rectangle();
	Triangle trgl=new Triangle();
	rect.setvalues(4, 5);
	trgl.setvalues(4, 5);
	System.out.println("rect a{0}"+rect.area());
	System.out.println("trgl b{0}"+trgl.area());
	}

}
