import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Board board = new Board();
        board.drawBoard();

        while (true) {
            System.out.print("Enter staring position (row[space]column): ");
            int rowStart = input.nextInt();
            int columnStart = input.nextInt();

            System.out.print("Enter ending position (row[space]column): ");
            int rowEnd = input.nextInt();
            int columnEnd = input.nextInt();

            Position start = new Position(rowStart, columnStart);
            Position end = new Position(rowEnd, columnEnd);

            boolean success = board.move(start, end);
            if (success) {
                System.out.println("Move successful");
            } else {
                System.out.println("Move failed");
            }

            board.drawBoard();

            System.out.print("Continue game? (y/n): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("y")) {
                break;
            }
        }

        input.close();
        System.out.println("Game over.");
    }
}