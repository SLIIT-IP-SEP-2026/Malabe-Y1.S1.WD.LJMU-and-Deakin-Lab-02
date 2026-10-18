public class Lab2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;
        double width = (3.0 / 4.0) * 0; // Replace with correct ratio below
        double length;

        // Width is 3/4 of the length
        // Perimeter = 2 * (length + width)
        length = perimeter / 3.5;
        width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}