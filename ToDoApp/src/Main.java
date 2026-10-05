import java.util.Scanner;
import java.util.ArrayList;

class Main{
public static void main(String[] args){
ArrayList<String> al = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
int choice;

do{
System.out.println("====== To_do List =====");
System.out.println("1. Add Task");
System.out.println("2. View Task");
System.out.println("3. Remove Task");
System.out.println("4. Exit App");
System.out.println("Enter your choice:");
choice = sc.nextInt();

sc.nextLine();

switch(choice){
case 1: 
	System.out.println("Enter the Task");
	String task = sc.nextLine();
	al.add(task);
	System.out.println("Task added");
	break;

case 2:
	System.out.println("Your Tasks");
	if(al.isEmpty()){
	System.out.println("No Tasks yet");
	}
	else{
	for(int i=0; i< al.size(); i++){
	System.out.println((i+1) + ". " + al.get(i));
		}
	}
	break;

case 3:
                    
		System.out.print("Enter the task number to remove: ");
                    int taskNum = sc.nextInt();
                    if (taskNum >= 1 && taskNum <= al.size()) {
                        al.remove(taskNum - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;


case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");


}


}while (choice != 4);

sc.close();

}

}