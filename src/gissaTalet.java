/*
    A simple program that lets you guess a number
    2019-10-17
    Author: Elliot Duchek  
*/

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Random;

public class gissaTalet {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(100) + 1;

        int nGuess = 0;

        int numOfGuess = 0;

        while (nGuess != n) {
            try {
                if (numOfGuess == 0) {
                    nGuess = (int) Math.round(Double.parseDouble(JOptionPane.showInputDialog(null, "Guess which number between 1-100 I'm thinking of!")));
                    if (nGuess != n) {
                        numOfGuess++;
                    }
                }
                else {
                    if (nGuess > n && nGuess <= 100 && nGuess > 0) {
                        nGuess = (int) Math.round(Double.parseDouble(JOptionPane.showInputDialog(null, "You guessed too high, my number is smaller than " + nGuess + ". Try again!")));
                        numOfGuess++;
                    } else if (nGuess < n && nGuess <= 100 && nGuess > 0) {
                        nGuess = (int) Math.round(Double.parseDouble(JOptionPane.showInputDialog(null, "You guessed too low, my number is larger than " + nGuess + ". Try again!")));
                        numOfGuess++;
                    } else {
                        nGuess = (int) Math.round(Double.parseDouble(JOptionPane.showInputDialog(null, "You didn't guess within the range of 1-100! Guess again.")));
                        numOfGuess++;
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You didn't type in a number!");
            }
        }

        JOptionPane.showMessageDialog(null, "You guessed right, my number was " + n + "! It took you " + numOfGuess + " guesses.");

    }
}
