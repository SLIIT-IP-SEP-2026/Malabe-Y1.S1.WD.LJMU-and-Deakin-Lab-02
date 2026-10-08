public class IT26102381Lab2Q3 {
    public static void main(String[] args) {

        double sideA = 3;
        double sideB = 4;

        // hypotaneous = (sideA^2 + sideB^2)

        double hypotaneous = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        System.out.println("Hypotaneous: " + hypotaneous);
    }
}