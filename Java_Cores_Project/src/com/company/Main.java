package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        char playAgain;
        System.out.println("Hello! Now you will play popular game Rock-Paper-Scissors with computer.");
        System.out.println("Instruction:\nYou need to input\n\"1\"-for Rock;\n\"2\"-for Paper;\n\"3\"-for Scissors;");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Input number, please ");
            //playerChois
            String text1 = br.readLine();
            int playerInput= Integer.parseInt(text1);
            String playerChois=Game.getChoice(playerInput);

            //computerChois
            int computerInput= (int) Math.round ((Math.random()*(3-1))+1);
            String computerChois=Game.computerGetChoice(computerInput);

            //Game chack logig
            String output=Game.determineWinner(computerChois, playerChois);
            System.out.println(output);


            System.out.println("Do you want to play again?");
            System.out.print("Enter Y for yes or N for no: ");
             String enter = br.readLine();
            playAgain = enter.charAt(0);
        } while(playAgain =='Y' || playAgain== 'y');


    }
}



