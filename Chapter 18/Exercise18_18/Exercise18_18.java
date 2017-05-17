import java.util.Scanner;

public class Exercise18_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        int n = input.nextInt();
        TowerOfHanoi.moveDisk(n, "A", "B", "C");
        System.out.println("Number : " + TowerOfHanoi.getNum());
    }
}