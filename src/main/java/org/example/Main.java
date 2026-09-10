package org.example;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static org.example.Sonnet.printSonnet;
import static org.example.Sonnet.sonnet;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void  main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numCorrect = 0;
        int numWrong = 0;
        int randomNum = 0;
        String guess;

        while ((numCorrect < 3) && (numWrong < 3)) {
            randomNum = ThreadLocalRandom.current().nextInt(0, 114);
            printSonnet(randomNum);
            guess = scnr.nextLine();
            if(guess.equals(sonnet[randomNum])) {
                System.out.println("Correct!");
                numCorrect += 1;
            }
            else {
                System.out.println("Incorrect!");
                numWrong += 1;
            }
        }

        if(numCorrect >= 3) {
            System.out.println("You win! Congrats!");
        }
        else {
            System.out.println("You lose, better luck next time.");
        }
    }
}
