package shape1;

public class Square {
	 private int lenght;
	    
     public Square(int len){
        this.lenght=len;
    }
    
    public int getArea() {
        return this.lenght*this.lenght;
    }
   
     public static void main(String []args){
         Square a= new Square(4);
    
    System.out.println(a.getArea());
     }
}
