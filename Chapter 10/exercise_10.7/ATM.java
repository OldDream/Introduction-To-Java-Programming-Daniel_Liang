import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] aco = new Account[10];
		for (int i = 0; i < 10; i++) {
			aco[i] = new Account(i, 100);
		} 

		while (true) {
			System.out.print("Enter an ID:");
			int id = input.nextInt();
			if(id == 666)
				break;
			while(id >= 0 && id < 10) {
				System.out.printf("Main menu\n1:check balance\n2:withdraw\n3:deposit\n4:exit\nEnter a choice:");
				int choice = input.nextInt();
				if (choice > 0 && choice < 5) {
					if (choice == 1)
						System.out.println("The balance is " + aco[id].getBalance());
					else if (choice == 2) {
						System.out.print("Enter an amount to withdraw: ");
						int cash = input.nextInt();
						aco[id].withDraw(cash);
					}else if (choice == 3) {
						System.out.print("Enter an amount to deposit: ");
						int cash = input.nextInt();
						aco[id].deposit(cash);
					}else if (choice == 4) {
						break;
					}
				}
			}
		}
	}
} 