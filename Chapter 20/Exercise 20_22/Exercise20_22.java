import java.util.Scanner; 

public class Exercise20_22 {
    public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of disks: ");
      int n = input.nextInt();

      // Find the solution recursively
      System.out.println("The moves are:");
      moveDisks(n, 'A', 'B', 'C');
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        
    }
}