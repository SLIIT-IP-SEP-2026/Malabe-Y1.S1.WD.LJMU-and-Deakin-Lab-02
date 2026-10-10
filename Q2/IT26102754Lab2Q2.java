public class IT26102754Lab2Q2
{
    public static void main (String[]args)
    {
        double length = 10;
        double perimeterSquare = length*4;
        
        //The perimeter of the square should be equal to the circumference of the circle.
        final double PI = 3.14159;
        double radius = perimeterSquare/(2*PI);

        System.out.println("Radius of the circular fence :" + radius );
    }
}