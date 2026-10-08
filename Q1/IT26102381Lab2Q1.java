public class IT26102381Lab2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;

        // perimeter = 2 * (3/4 * length + length)
        // Therefore,
        // length = perimeter / (7.0 / 2.0)
        // width = length * (3.0 / 4.0)

        double length = perimeter / (7.0 / 2.0);
        double width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}