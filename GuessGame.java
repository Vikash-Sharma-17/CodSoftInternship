package NumberGame;

import java.util.*;

public class GuessGame {
    public static int score = 0;
    public static Scanner sc = new Scanner(System.in);
    public static int randomNumber(){
        int max = 100;
        int min = 1;
        int rand = (int)(Math.random()*(max - min +1 ) + min);
        return rand;
    }
    public static void guessGame(){
        int guess = 0;
        int r = randomNumber();
        do {
            System.out.println("Enter your guess: ");
            int g = sc.nextInt();

            if (g == r) {
                System.out.println("You guessed the number!\nYou win!");
                guess++;
                break;
            }

            else if (g > r) {
                System.out.println("Your guess is too high.");
                guess++;
            }

            else {
                System.out.println("Your guess is too low.");
            }
            guess++;
        }while (guess < 20);

        if(guess == 20){
            System.out.println("You have Reached Limit");
        }else{
            System.out.println("Number of Guess you have taken : "+ guess);
        }

        score++;
    }
    public static void game(){

        boolean again = true;
        do{
            guessGame();

            System.out.println(" Do you Want to play again (y/n): ");
            String s = sc.next();
            if(s.equals("y")){
                continue;
            }else{
                again = false;
            }
        }while(again);

        System.out.println("Your Score : "+ score);
        System.out.println("Thanks For Playing ");
    }

    public static void main(String[] args) {

        System.out.println(" Do you want to start the Guessing Game !!!! ");
        System.out.println(" For Start Press y");
        String x = sc.next();
        if(x.equals("y")){
            game();
        }else{
            System.out.println("Thank you !!!");
        }
    }
}
