public class IT26102437Lab2Q1 {
	public static void main(String[]args) {
		double perimeter = 100.0;
		// perimeter = 2.0 * (length + width)
		// length + width = perimeter/2 = 50.0
		// width = 3.0/4.0 * length
		//length = (perimeter/2.0)/ (1.0 + (3.0/4.0))= 50.0
		double length = (perimeter/2.0) / (1.0 + (3.0/4.0));
		double width = 3.0/4.0 * length;
		System.out.println("Length of the fence: " + length);
		System.out.println("Width of the fence: " + width); 
	}
	
} 
	
		