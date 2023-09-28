import java.util.Scanner;
class Main{
	
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type your name.");
		String name = scan.nextLine();

		System.out.println("Hello "+name+". Please type your age.");
		int age = Integer.parseInt(scan.nextLine());
		System.out.println("Your age is: "+age+".");

		int yearsUntilRetire = 67-age; 
		System.out.println("You have " + yearsUntilRetire + " years left until retirement.");





		


	}


}