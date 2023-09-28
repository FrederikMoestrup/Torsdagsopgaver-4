import java.util.ArrayList;
class Team{
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames = new ArrayList<String>();


	Team(String teamName){
		this.teamName=teamName;

	}
    //Rank setter
	public void setRank(int teamRank){
		this.teamRank=teamRank;
	}


	//Override
	public String toString(){

		String s = "Hold: " + this.teamName + ", Rang: " + this.teamRank;
		return s;
	}



}