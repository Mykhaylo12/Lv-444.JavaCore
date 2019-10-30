package com.company;

public class Game {

    public static String getChoice(int playerInput) {

        String choice;
    switch (playerInput) {
        case 1:
            System.out.println("You enter rock");
            choice = "rock";
            break;
        case 2:
            System.out.println("You enter paper");
            choice = "paper";
            break;
        case 3:
            System.out.println("You enter scissors");
            choice = "scissors";
            break;
        default:
            choice = null;
    }

            return choice;
        }


    public static String computerGetChoice(int computerInput) {

        String choice;
        switch (computerInput) {
            case 1:
                System.out.println("Computer enter rock");
                choice = "rock";
                break;
            case 2:
                System.out.println("Computer enter paper");
                choice = "paper";
                break;
            case 3:
                System.out.println("Computer enter scissors");
                choice = "scissors";
                break;
            default:
                choice = null;
        }
        return choice;
    }


    public static String determineWinner(String computerChoice, String playerChoice) {
        String output="";

        // check logic
        if (playerChoice.equals("rock")) {
            if (computerChoice.equals("scissors"))
                output = "Rock beats scissors.\nYou won! You are lacky today! Run to casino. :)";
            else if (computerChoice.equals("paper"))
                output = "Paper beats rock.\nComputer won! Don't be disappointed, it's just a game. ";
            else
                output = "Look like this is draw! At list , you didn't loose. Try again.";
        } else if (playerChoice.equals("paper")) {
            if (computerChoice.equals("scissors"))
                output = "Scissors beats paper.\nComputer won! Next time my friend. :(";
            else if (computerChoice.equals("rock"))
                output = "Paper beats rock.\nYou won! You are lacky today! Run for Bingo ticket. :)";
            else
                output = "Look like this is draw! At list , you didn't loose. Try again.";
        } else if (playerChoice.equals("scissors")) {
            if (computerChoice.equals("rock"))
                output = "Rock beats scissors.\nComputer won! Try your best in the next round. :(";
            else if (computerChoice.equals("paper"))
                output = "Scissors beats paper.\nYou won! You are lacky today! Ask your boss about propotion. :) ";
            else
                output = "Look like this is draw! At list , you didn't loose. Try again.";
        }
        return output;
    }





}



