import java.util.Scanner;

class calculator{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
double result;

System.out.println("Enter first number.");
double num1 = sc.nextDouble();

System.out.println("Enter Operator:");
String operator = sc.next();

System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

switch(operator){
case "+": 
	result = num1 + num2;
	System.out.println(result);
	break;
case "-": 
	result = num1 - num2;
System.out.println(result);
	break;
case "*": 
	result = num1 * num2;
System.out.println(result);
	break;
case "/":
	if(num1==0||num2==0){
	System.out.println("division cannot be done");
	}
	else{
	 result = num1 / num2;
System.out.println(result);
	}
default:
	System.out.println("Enter valid Operator");

}

}

}