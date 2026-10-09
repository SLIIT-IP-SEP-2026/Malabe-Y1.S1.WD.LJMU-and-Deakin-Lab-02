public class IT26102722Lab2Q2 {

    public static void main(String[] args) {

        // Given side length of the square
        double side = 10.0;

        // Calculate the perimeter of the square
        double perimeter = 4 * side;

        // Calculate the radius of the circle using the perimeter as circumference
        // r = circumference / (2 * pi)
        double radius = perimeter / (2 * Math.PI);

        // Output the calculated radius
        System.out.println("Radius of the circle: " + radius);
    }
}