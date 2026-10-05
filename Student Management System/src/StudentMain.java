import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class StudentMain{

static Scanner sc = new Scanner(System.in);
static List<Student> students = new ArrayList<Student>();

static void addStudent(){
	System.out.println("Enter Id");	
	int id = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter name");
	String name = sc.nextLine();

	System.out.println("Enter Age");
	int age = sc.nextInt();

	System.out.println("Enter grade");
	String grade = sc.nextLine();

	students.add(new Student(id,name,age,grade));
	System.out.println("Student added succefully.");
}

static void viewStudent(){
if(students.isEmpty()){
System.out.println("No Students to display.");
}
else{
for(Student s1: students){
System.out.println(s1);
}
}

static void removeStudent(){
System.out.println("Enter the id of Student: ")
int id = sc.nextInt();

for(Student s: students){
if(s.id == id){
students.remove(s);
System.out.println("Student remove successfully");
return;	
}
}
System.out.println("Student not found");
}


}

}
}