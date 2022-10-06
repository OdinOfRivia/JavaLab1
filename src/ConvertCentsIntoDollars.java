import java.util.Scanner;


public class ConvertCentsIntoDollars {
    public static void main(String[] args) {
        try (Scanner chinesegirlf = new Scanner(System.in)) {
            System.out.println("Insert the number of cents that you would like to trasnform in dollars");
            int x = chinesegirlf.nextInt();
            
            int cents = (x % 100);
            int dollars = (x / 100);

            System.out.println("You have " + dollars + " dollars and " +cents+ " cents");
        }
      
        


    }
}


