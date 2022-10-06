import java.util.Scanner;

public class FindTheAreaOfACircle {
    public static void main(String[] args) throws Exception {
        System.out.println("Find the Area of a Circle!");

        double radius,area; 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radiusd:");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * radius*radius; 
        System.out.println("The area is:" +area);
        
    }
}
