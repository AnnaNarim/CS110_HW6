import shape1.Square;
import shape1.Rectangle;
import utils.Math;
public class Driver {
	 public static void main(String []args){
		 Square b = new Square(100);
		 Rectangle c= new Rectangle(50,80);
		
		 System.out.println(Math.factorial((int)15.6));
		 System.out.println(Math.factorialLoop((int)15.6));
		 
		 System.out.println(b.getArea());
		 System.out.println(c.getArea());
	 }
}
