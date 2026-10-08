public class IT26102381Lab2Q2 {

    public static void main(String[] args) {

        double sideLength = 10;

        // sidelength*4 = circumference
        // where circumference = 2 * pi * r
        // Therefore,
        // r = circumference / (2 * pi)
        // Therefore,
        // r = (sidelength*4) / (2 * pi)

        double radius = (sideLength*4) / (2 * Math.PI);

        System.out.println("Radius is: " + radius);
    }
}