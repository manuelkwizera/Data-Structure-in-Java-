import java.util.*;
public class DataStracture {
	
	
}


/*--------------------------------------STACK-----------------------------------*/



class StackProgram extends DataStracture{
	static Scanner obj = new Scanner(System.in);
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void push() {
		System.out.print("ENTER SIZE => ");
		int n = StackProgram.obj.nextInt();
		System.out.println();
		System.out.println("\t\tPUSH OPERATION");
		System.out.println("\t--------------\n");
		for(int i=0;i<n;i++) {
			System.out.print("ELEMENT"+i+"  ");
			stack.push(obj.nextInt());
		}		
	}
	
	
	public static void pop() {
		System.out.println("\n\t\tPOP OPERATION");
		System.out.println("\t--------------\n");
		System.out.println(stack.peek()+" IS REMOVED FROM STACK\n");
		stack.pop();
		
	}
	
	public static void peep() {
		System.out.println("\n\tPEEP OPERATION");
		System.out.println("\t---------------\n");
		System.out.println(stack.peek()+" IS THE TOPMOST ELEMENT IN STACK\n");
	}
	
	public static void search(int x) {
		System.out.println("\n\tSEARCH OPERATION");
		System.out.println("\t---------------\n");
		if(stack.search(x) == -1) {
			
			System.out.println("ELEMENT "+x+" IS NOT PRESENT IN STACK");
		}
		else {
			System.out.println("ELEMENT "+x+" IS PRESENT IN STACK ON INDEX "+stack.search(x)+"\n");
		}
	}
	
	
	public static void display() {
		System.out.println("\n\t\tDISPLAY OPERATION");
		System.out.println("\t----------------\n");
		System.out.println("THE STACK IS: " + stack);
		System.out.println();
	}

	public static int stackMain() {
		
		String sDataType = "\n\t\tSTACK OPERATIONS\n"
				+ "\t\t----------------\n";
		
		String operations = "1. PUSH OPERATION\n"
				+ "2. POP OPERATION\n"
				+ "3. PEEP OPERATION\n"
				+ "4. SEARCH OPERATION\n"
				+ "5. DISPLAY OPERATION\n"
				+ "6. EXIT"; 
		outer:
		while(true) {
			System.out.println(sDataType);
			System.out.println(operations);
			System.out.print("\nENTER THE CHOICE: ");
			int choice = obj.nextInt();
			if(choice == 1) {
				
					StackProgram.push();
				
			}
			else if(choice == 2){
				if(stack.isEmpty()) {
					System.out.println("\nSTACK UNDERFLOW, PLZ INSERT ELEMENTS IN STACK\n");
					continue outer;
				}
				else {
					
					StackProgram.pop();
				}
				
			}
			else if(choice == 3) {
				if(stack.isEmpty()) {
					System.out.println("\nSTACK UNDERFLOW, PLZ INSERT ELEMENTS IN STACK\n");
					continue outer;
					
				}
				else {
					StackProgram.peep();
				}
				
			}
			else if(choice == 4) {
				if(stack.isEmpty()) {
					System.out.println("\nSTACK UNDERFLOW, PLZ INSERT ELEMENTS IN STACK\n");
					continue outer;
					
				}
				else {
					
					System.out.print("\nENTER THE ELEMENT FOR SEARCH: ");
					int x = obj.nextInt();
					StackProgram.search(x);
				}
			}
			else if(choice == 5) {
				if(stack.isEmpty()) {
					System.out.println("\nSTACK UNDERFLOW, PLZ INSERT ELEMENTS IN STACK\n");
					continue outer;
					
				}
				else {
					StackProgram.display();
				}
			}
			else if(choice == 6) {
				return 1;
			}
			else {
				System.out.println("\nPLEASE ENTER VALID CHOICE");
			}
		}	
	}
}




/*--------------------------------------QUEUE-----------------------------------*/







class QueueProgram extends DataStracture{
	

	static Scanner obj = new Scanner(System.in);
	static Queue<Integer> queue = new ArrayDeque<Integer>();
	
	
	public static void enqueue() {
		
		System.out.print("\nENTER SIZE => ");
		int m = QueueProgram.obj.nextInt();
		System.out.println();
		System.out.println("\t\tENQUEQUE OPERATION");
		System.out.println("\t\t-----------------\n");
		for(int i=0;i<m;i++) {
			
			System.out.print("ELEMENT"+i+" => ");
			queue.add(obj.nextInt());
		}
	}
	
	
	public static void dequeue() {
		
		if(queue.isEmpty()) {
			System.out.println("\n\t\t>>> QUEUE UNDERFLOW, PLZ INSERT ELEMENTS IN QUEUE <<<\n");
			
		}
		else {
			System.out.println("\n\t\tDEQUEUE OPERATION");
			System.out.println("\t\t------------------\n");
			System.out.println("REMOVED ELEMENT => "+queue.element());
			queue.remove();
		}
	}
	
	public static void peek() {
		if(queue.isEmpty()) {
			System.out.println("\n\t\t>>> QUEUE UNDERFLOW, PLZ INSERT ELEMENTS IN QUEUE <<<\n");
			
		}
		else {
		
			System.out.println("\n\t\tPEEP OPERATION");
			System.out.println("\t\t---------------\n");
			System.out.println("FRONT ELEMENT => "+queue.element()+"\n");
		}
	}
	
	public static void searchQueue(int y) {
		
		if(queue.isEmpty()) {
			System.out.println("\n\t\t>>> QUEUE UNDERFLOW, PLZ INSERT ELEMENTS IN QUEUE <<<\n");
			
		}
		else {
		System.out.println("\n\t\tSEARCH OPERATION");
		System.out.println("\t\t---------------\n");
		if(queue.contains(y) && !queue.isEmpty()) {
			
			System.out.println("ELEMENT => "+y+" IS PRESENT IN A QUEUE");
		}
		else {
			System.out.println("ELEMENT => "+y+" IS NOT PRESENT IN A QUEUE\n");
			}
		}
	}
	
	public static void displayQueue() {
		
		System.out.println("\n\t\tDISPLAY OPERATION");
		System.out.println("\t\t----------------\n");
		System.out.println("THE QUEUE IS => " + queue);
		System.out.println();
	}
	
	public static int queueMain() {
		
		String qDataType = "\t\tQUEUE OPERATIONS\n"
				+ "\t\t----------------\n";
		String qOperations = "1. ENQUEUE OPERATION\n"
				+ "2. DEQUEUE OPERATION\n"
				+ "3. SEARCH OPERATION\n"
				+ "4. DISPLAY OPERATION\n"
				+ "5. PEEK OPERATION\n"
				+ "6. EXIT";
		
		while(true) {
			System.out.println(qDataType);
			System.out.println(qOperations);
			System.out.print("\nENTER THE CHOICE: ");
			int qChoice = obj.nextInt();
			
			if(qChoice == 1) {
				
				QueueProgram.enqueue();
			}
			else if(qChoice == 2) {
				
				QueueProgram.dequeue();
			}
			else if(qChoice == 3) {
				
				System.out.print("\nENTER THE ELEMENT FOR SEARCH: ");
				int qsearch = obj.nextInt();
				QueueProgram.searchQueue(qsearch);
				
			}
			else if(qChoice == 4) {
				
				QueueProgram.displayQueue();

			}
			else if(qChoice == 5) {
				
				QueueProgram.peek();
				
			}
			else if(qChoice == 6) {
				System.out.println("EXIT...");
				return 1;
				
			}
			else {
				System.out.println("\n\t\t>>> PLEASE ENTER VALID CHOICE <<<\n");
			}
			
		}

	}
}



/*--------------------------------------LINKED LIST-----------------------------------*/




class LinkedListProgram extends DataStracture{
	
	
	

	static Scanner obj = new Scanner(System.in);
	static LinkedList<Integer> linkedList = new LinkedList<Integer>();
	
	public static void insertion() {
		
		System.out.println("\n\t\tINSERTION OPERATION");
		System.out.println("\t\t-----------------\n");
		String insertionChoice = "1. INSERT ELEMENT AT HEAD\n"
				+ "2. INSERT ELEMENT AT END\n"
				+ "3. INSERT AT INDEX POSITION\n"
				+ "4. INSERT MULTIPLE ELEMENTS";
		System.out.println(insertionChoice);
		System.out.print("\nENTER THE CHOICE => ");
		int lInsert = obj.nextInt();
		System.out.println();
		if(lInsert == 1) {
			System.out.print("ENTER ELEMENT => ");
			linkedList.addFirst(obj.nextInt());
		}
		else if(lInsert == 2) {
			System.out.print("ENTER ELEMENT => ");
			linkedList.addLast(obj.nextInt());
		}
		else if(lInsert == 3) {
			System.out.print("ENTER INDEX => ");
			int insIndex = obj.nextInt();
			System.out.print("ENTER ELEMENT => ");
			int insElement = obj.nextInt();
			linkedList.add(insIndex, insElement);
			
		}
		else if(lInsert == 4) {
			
			System.out.print("ENTER SIZE => ");
			int l = obj.nextInt();
			System.out.println();
			for(int i=0;i<l;i++) {
				
				System.out.print("ELEMENT"+i+" => ");
				linkedList.add(obj.nextInt());
			}
		}
		else {
			System.out.println("\n\t\t>>> PLEASE ENTER VALID CHOICE <<<\n");
		}
	}
	
	
	
	
	
	public static void deletion() {
		
		if(linkedList.isEmpty()) {
			System.out.println("\n\t\t>>> QUEUE UNDERFLOW, PLZ INSERT ELEMENTS IN QUEUE <<<\n");
			
		}
		else {
			
			System.out.println("\n\t\tDELETION OPERATION");
			System.out.println("\t\t-----------------\n");
			String deletionChoice = "1. REMOVE FIRST ELEMENT \n"
					+ "2. REMOVE FIRST OCCURRENCE ELEMENT \n"
					+ "3. REMOVE ELEMENT AT INDEX POSITION\n"
					+ "4. REMOVE ALL ELEMENTS";
			System.out.println(deletionChoice);
			System.out.print("\nENTER THE CHOICE => ");
			int lInsert = obj.nextInt();
			System.out.println();
			if(lInsert == 1) {
				
				linkedList.remove();
			}
			else if(lInsert == 2) {
				
				System.out.print("ENTER ELEMENT => ");
				int delElement = obj.nextInt();
				linkedList.remove(delElement);
			}
			else if(lInsert == 3) {
				System.out.print("ENTER INDEX => ");
				int delIndex = obj.nextInt();
				linkedList.remove(delIndex);
			}
			else if(lInsert == 4) {
				
				linkedList.clear();
			}
			else {
				System.out.println("\n\t\t>>> PLEASE ENTER VALID CHOICE <<<\n");
			}
			
		}	
	}
	
	
	
	public static void displayList() {
		System.out.println("\n\t\tDISPLAY OPERATION");
		System.out.println("\t\t----------------\n");
		System.out.println("THE LINKEDLIST IS => " + linkedList);
		System.out.println();
	}
	
	
	public static void searchList(int searchElement) {
		
		if(linkedList.isEmpty()) {
			System.out.println("\n\t\t>>> QUEUE UNDERFLOW, PLZ INSERT ELEMENTS IN QUEUE <<<\n");
			
		}
		else {
			
			System.out.println("\n\t\tSEARCH OPERATION");
			System.out.println("\t\t---------------\n");
			if(linkedList.contains(searchElement) && !linkedList.isEmpty()) {
				
				System.out.println("ELEMENT => "+searchElement+" IS PRESENT IN A LIST");
			}
			else {
				System.out.println("ELEMENT => "+searchElement+" IS NOT PRESENT IN A LIST\n");
				}
		}
		
	}
	
	

	public static void listMain() {
		
		String lDataType = "\n\t\tLINKEDLIST OPERATIONS\n"
				+ "\t\t---------------------\n";
		String lOperations = "1. INSERTION OPERATION\n"
				+ "2. DELETION OPERATION\n"
				+ "3. DISPLAY OPERATION\n"
				+ "4. SEARCH OPERATION\n"
				+ "5. EXIT";
		
		while(true) {
			System.out.println(lDataType);
			System.out.println(lOperations);
			System.out.print("\nENTER THE CHOICE => ");
			int qChoice = obj.nextInt();
			
			if(qChoice == 1) {
				
				LinkedListProgram.insertion();
			}
			else if(qChoice == 2) {
				
				LinkedListProgram.deletion();
			}
			else if(qChoice == 3) {
				
				LinkedListProgram.displayList();
			}
			else if(qChoice == 4) {
				
				System.out.print("\nENTER THE ELEMENT FOR SEARCH: ");
				int lsearch = obj.nextInt();
				LinkedListProgram.searchList(lsearch);
			}
			else if(qChoice == 6) {
				System.out.println("EXIT...");
				System.exit(1);
			}
			else {
				System.out.println("\n\t\t>>> PLEASE ENTER VALID CHOICE <<<\n");
			}
			
		}

	}
}



