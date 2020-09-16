import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("Insert side 1:");
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        System.out.println("Insert side 2:");
        double input2 = scanner.nextDouble();
        System.out.println("Insert side 3:");
        double input3 = scanner.nextDouble();
        System.out.println("Insert color: ");
        String inputColor = scanner.next();

        Triangle triangle = new Triangle(input1,input2,input3);

        triangle.setColor(inputColor);
        System.out.println(triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter() + ", Area: " + triangle.getArea() + " Color: " + triangle.getColor());
    }
}
