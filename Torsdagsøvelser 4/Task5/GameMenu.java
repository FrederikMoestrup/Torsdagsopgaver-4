//import java.util.ArrayList;
import java.util.Scanner;
class GameMenu{
	private ArrayList<String> actions = new ArrayList<String>();


	GameMenu(ArrayList<String> actions){
		this.actions=actions;

    }

    void displayMenu(){

    for(String s: actions){

    	System.out.println(s);
    }


    }

    String getAction(){
    System.out.println("Type a number to choose an action.");
    displayMenu();
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    return input;
    }




}