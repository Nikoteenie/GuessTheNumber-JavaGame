import java.util.Scanner;
import java.util.Random;
//takes in user input

public class GuessGame {
    public static void main(String[] args) {

       int secretNumber; // what the number is set to
        int userGuess; // the user input
        int guessCount = 0; // number of users guesses
        boolean correct = false; // set to false so that it's changed to true when guessed correctly

        Scanner keyboard = new Scanner(System.in); // so that we can use the user input


      //Creates the max and min number the object can randomly generate
        int maxNumber = 1000;
        int minNumber = 1;
        //Creates a random number object
        Random randomNumber = new Random();
        //Attaches the random number object to secretNumber making it a short number
        secretNumber = minNumber + randomNumber.nextInt(maxNumber);




//        Info for user to put in secretNumber:
//        secretNumber = keyboard.nextInt(); // nextInt() --> next integer put in on keyboard
//        // Sets the secretNumber to what the user input is
//



        //Loop through asking for numbers until the user guesses the secretNumber.
        // Create loop to move through the guesses
        while(!correct) { // while not false == true

            System.out.print("Guess the number that I am thinking: ");

            userGuess = keyboard.nextInt();

            if(userGuess == secretNumber) { // if guessed correctly
                correct = true;
                System.out.println("!!!YOU'RE A WINNER!!!");
                System.out.println("It took you " +guessCount+ " guesses!");// includes number of wrong guesses

            } else if (userGuess < secretNumber){
                System.out.println("GUESS HIGHER");
                guessCount++; //counts wrong guesses

            } else if (userGuess > secretNumber) {
                System.out.println("GUESS LOWER");
                guessCount++;//counts wrong guesses
            }


        }

    }
}
