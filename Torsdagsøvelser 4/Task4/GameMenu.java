import java.util.ArrayList;
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



}