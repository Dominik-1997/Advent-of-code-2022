package org.example;

import java.io.*;


//"The first column is what your opponent is going to play: A for Rock, B for Paper, and C for Scissors.
// The second column--" Suddenly, the Elf is called away to help with someone's tent.
// The second column, you reason, must be what you should play in response: X for Rock, Y for Paper, and Z for Scissors.

// Your total score is the sum of your scores for each round.
// The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
// plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).


public class Main {
    public static void main(String[] args) throws IOException {
        // File path is passed as parameter
        File file = new File(
                "C:\\Users\\domin\\Downloads\\Advent of Code\\AdventOfCode2\\src\\main\\java\\org\\example\\input.txt");

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string

        int score = 0;

        while ((st = br.readLine()) != null){
            switch (st) {
                case "A X" -> score += 1 + 3;
                case "A Y" -> score += 2 + 6;
                case "A Z" -> score += 3 + 0;

                case "B X" -> score += 1 + 0;
                case "B Y" -> score += 2 + 3;
                case "B Z" -> score += 3 + 6;

                case "C X" -> score += 1 + 6;
                case "C Y" -> score += 2 + 0;
                case "C Z" -> score += 3 + 3;
                default -> System.out.println("invalid character");
            }
        }
        System.out.println(score);

    }
}