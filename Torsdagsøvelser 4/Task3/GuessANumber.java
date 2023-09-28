import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;


	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		// Create a Scanner object
        Scanner scan = new Scanner(System.in);   	 
    	// Read user input
    	String input = scan.nextLine();
        
         
        System.out.println( "Please type your number again.");
        //use hasNextDouble to check if input is numeric,
        if(scan.hasNextDouble()){
        double guessedNum = Double.parseDouble(input);
            // if so...
            // Compare it with the random number
            if(guessedNum == rnd_number){

            //   Let the user know the result of the comparison
                System.out.println("You guessed correctly!");
            }
            else if(guessedNum < rnd_number){
            //   Let the user know the result of the comparison
                System.out.println("You guess is lower than the number I'm thinking of. Try again!");
            //   Let the user try again by calling this method recursively
                makeAGuess();
            }
            else if(guessedNum > rnd_number){
            //   Let the user know the result of the comparison
                System.out.println("You guess is higher than the number I'm thinking of. Try again!");
            //   Let the user try again by calling this method recursively
                makeAGuess();
            }
            else{
            System.out.println("Something went wrong..");  
            }

        
        }
        // if input was not numeric show an error message and call this method recursively
        else{
        System.out.println("Input was not numeric try again.");
        makeAGuess();
        }

        
        
        
        
        
        
        
        

    }
   

}