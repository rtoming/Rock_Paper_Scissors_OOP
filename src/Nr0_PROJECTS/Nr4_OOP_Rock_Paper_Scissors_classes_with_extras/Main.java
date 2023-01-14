package Nr0_PROJECTS.Nr4_OOP_Rock_Paper_Scissors_classes_with_extras;

import java.util.Scanner;

class Game {

    class User {
        String getUserInput() {
            String userInput;
            while(true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your choice (rock, paper, scissors): ");
                userInput = scanner.next();
                userInput.toLowerCase();
                if (userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors")) {
                    break;
                }
                scanner.close();
            }
            return userInput;
        }
    }

    class Computer {
        String getComputerChoice() {
            String computerChoice;
            int randomNumber = (int) (Math.random() * 3 + 1);
            if (randomNumber == 1) {
                computerChoice = "rock";
            } else if (randomNumber == 2) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            return computerChoice;
        }
    }

    class Result {
        String getResult(String user, String computer) {
            if (user.equals(computer)) {
                return "draw";
            } else if (user.equals("rock") && computer.equals("scissors")) {
                return "win";
            } else if (user.equals("paper") && computer.equals("rock")) {
                return "win";
            } else if (user.equals("scissors") && computer.equals("paper")) {
                return "win";
            } else {
                return "loose!";
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {

        while (true) {
            Game game = new Game();

            //for (int i = 1; i < 5; i++) {} //how many games reload
            String user = game.new User().getUserInput();
            String computer = game.new Computer().getComputerChoice();
            String result = game.new Result().getResult(user, computer);

            System.out.println("User choice: " + user);
            System.out.println("Computer choice: " + computer);
            System.out.println("Result: " + result);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.next();
            playAgain = playAgain.toLowerCase();
            if (playAgain.equals("n")) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println();
                System.out.println("Lets start!");
            }
        }
    }
}
