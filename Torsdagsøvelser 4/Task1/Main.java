class Main{
	
	public static void main(String [] args){

		Team[] teams = new Team[5];

		teams[0] = new Team("Luftens Helte");
		teams[1] = new Team("De lange lopper");
		teams[2] = new Team("Hest med ekstra hest");
		teams[3] = new Team("Kims hold");
		teams[4] = new Team("CyberADDictz");
		

		for(int i=0; i<teams.length; i++){
		teams[i].setRank(i+1);
		}

		for(Team t: teams){ 
		System.out.println(t.toString());
		}


	}


}