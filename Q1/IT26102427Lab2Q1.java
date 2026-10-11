import java.util.Scanner; 

public class IT26102427Lab2Q1 { 
    public static void main(String []args) { 

    Scanner input = new Scanner(System.in); 

    System.out.print("Enter the perimeter of the fence: "); 
    double perimeter = input.nextDouble(); 

    double length = perimeter / 3.5; 
    double width = (3.0/4.0) * length; 

    System.out.println("Length of the fence: " + length); 
    System.out.println("Width of the fence: " + width); 


    }
}