import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Circle, 2 for Rectangle:");
        int choice = scanner.nextInt();
        
        Shape shape;
        if (choice == 1) {
            System.out.println("Enter radius:");
            double radius = scanner.nextDouble();
            shape = new Circle(radius);
        } else {
            System.out.println("Enter width and height:");
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            shape = new Rectangle(width, height);
        }
        
        System.out.println("The area is: " + shape.area());
    }
}