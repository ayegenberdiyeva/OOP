import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> shapes = new ArrayList<>();

        while (true){
            System.out.println("Choose a shape to draw:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");

            String choice = scanner.nextLine();
            if(choice.equals("1")){
                System.out.println("Enter the radius:");
                int radius = scanner.nextInt();
                System.out.println("Enter the color (WHITE, BLACK, RED, GREEN, BLUE):");
                String color = scanner.nextLine();
                if (color.equalsIgnoreCase("WHITE" || color.equalsIgnoreCase("BLACK")) || ){}
                System.out.println("Enter the position:");
                int position = scanner.nextInt();
                scanner.nextLine();

                shapes.add(new Circle(position, color, radius));
            }
            else if(choice.equals("2")){}
            else if(choice.equals("3")){}
        }




        scanner.close();
    }
}