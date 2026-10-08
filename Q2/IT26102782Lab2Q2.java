//Radius of a circular fence

public class IT26102782Lab2Q2 {
	public static void main(String [] args){
	
		double length = 10;
		double pi = 22.0 / 7;
		
		double perimeter = 4*length;
		double radius = perimeter / (2 * pi);
		
		System.out.println("Radius of the circular fence:"+ radius);
	}
}