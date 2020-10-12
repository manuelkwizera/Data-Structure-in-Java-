import java.util.Scanner;

public class Main {

	static Scanner obj = new Scanner(System.in);
	public static void main(String[] args) {
		
		String dataStracture = "1. STACK\n"
							+ "2. QUEUE\n"
							+ "3. LINKED LIST";
		while(true) {
			System.out.print("\n\t\tCHOOSE A DATA STRACTURE TYPE\n");
			System.out.println("\t\t----------------------------");
			System.out.println(dataStracture);
			System.out.print("\nENTER THE CHOICE: ");
			int choice = obj.nextInt();
			if(choice == 1) {
				
				StackProgram.stackMain();
			}
			else if(choice == 2) {
				
				QueueProgram.queueMain();
			}
			else if(choice == 3) {
				LinkedListProgram.listMain();
			}
			else {
				System.out.println("\n\t\t>>> PLEASE ENTER VALID CHOICE <<<\n");
			}
					
		}
	}

}
