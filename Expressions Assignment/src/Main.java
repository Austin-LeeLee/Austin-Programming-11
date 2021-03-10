import java.util.Scanner;


class Main {
    public static void main(String args[]) {


        System.out.println("Choose ROCK, PAPER, or SCISSORS. '0' for rock, '1' for paper, '2' for scissors");
        Scanner scan = new Scanner(System.in);
        int computerChoice = (int) (Math.random() * 3);
        int playerChoice = Integer.parseInt(scan.next());

        System.out.print("Computer Choice: " + computerChoice);
        System.out.println("    Player Choice : " + playerChoice);

        //Checking to see if player and computer (AI) chooses the same thing.
        if (computerChoice == playerChoice)
            System.out.println("Draw!");

        //If player chooses rock
        if ((playerChoice == 0) && (computerChoice == 1)) {
            System.out.println("Computer Wins!");
        } else if ((playerChoice == 0) && (computerChoice == 2))
            System.out.println("Player wins! ");

        //If player chooses paper
        if ((playerChoice == 1) && (computerChoice == 0)) {
            System.out.println("Player wins!");
        } else if ((playerChoice == 1) && (computerChoice == 2))
            System.out.println("Computer Wins!");

        //If player chooses scissors
        if ((playerChoice == 2) && (computerChoice == 0))
            System.out.println("Computer Wins!");
        else if ((playerChoice == 2) && (computerChoice == 1))
            System.out.println("Player wins!");

        //Checking to see if player inserts a valid number that is less than 3
        if (!(playerChoice < 3))
            System.out.println( playerChoice + " is not a valid choice, please play again. ");





    }
}




















