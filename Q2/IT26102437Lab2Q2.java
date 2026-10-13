public class IT26102437Lab2Q2 { 
public static void main (String[]args){
	double length = 10.0;
	double perimeter = 4 * length;
	double PI = 3.14;
	//  perimeter of square = circumference of circle 
	// circumference = 2 * PI * radius 
	// radius = Circumference / (2 * PI)
	double radius = perimeter / (2* PI);
	System.out.println("Radius of the circular fence : " + radius);
  }
} 
