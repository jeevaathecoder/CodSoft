import java.util.Scanner;

public class Guess_Number {

    public static int random_number() {
        int random_number = (int)(Math.random() * 10);
        return random_number;
    }

    public static void guess_game(int number, int score, int guess_number) {
        Scanner scan = new Scanner(System.in);
        while (score > 0) {
            if (number > guess_number) {
                System.out.println("Your Guessed number is Smaller than the actual Number!");
                score--;
            } else if (number < guess_number) {
                System.out.println("Your Guessed Number is Greater than the actual Number");
                score--;
            }

            System.out.println("Enter a Guess Number: ");
            guess_number = scan.nextInt();

            if (number == guess_number) {
                System.out.println("Congratulations, You have found the Correct Number");
                System.out.println("Your Score is: " + score);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess_number, number, score;
        System.out.println("! NUMBER GUESSING GAME !");
        System.out.println("! MAX ATTEMPTS: 20 !");
        do {
            System.out.println("Enter a Guess Number: ");
            guess_number = scan.nextInt();
            number = random_number();
            score = 20;
            guess_game(number, score, guess_number);
            System.out.println("Do You Want to Play Again ?");
            System.out.println("Press 1 to Play Again");
            System.out.println("Press 2 to Quit the Game");
            int opinion = scan.nextInt();
            if (opinion == 2) {
                break;
            } else if (opinion != 1) {
                System.out.println("Invalid Input");
                break;
            }
        } while (true);
    }
}
