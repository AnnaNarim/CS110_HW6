package shape1;

public class Rectangle {
	 private int width;
	 private int height;
	    
     public Rectangle(int w, int h){
        this.width=w;
        this.height=h;
    }
    
    public int getArea() {
        return this.width*this.height;
    }
   
     public static void main(String []args){
         Rectangle a= new Rectangle(4,6);
    
    System.out.println(a.getArea());
     }
}
