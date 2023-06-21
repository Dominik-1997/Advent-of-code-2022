package org.example;

import java.io.*;


//"Anyway, the second column says how the round needs to end: X means you need to lose,
// Y means you need to end the round in a draw, and Z means you need to win. Good luck!"
//
// The total score is still calculated in the same way, but now you need to figure
// out what shape to choose so the round ends as indicated. The example above now goes like this:
//
// In the first round, your opponent will choose Rock (A), and you need the round
// to end in a draw (Y), so you also choose Rock. This gives you a score of 1 + 3 = 4.
// In the second round, your opponent will choose Paper (B), and you choose Rock so you lose (X) with a score of 1 + 0 = 1.
// In the third round, you will defeat your opponent's Scissors with Rock for a score of 1 + 6 = 7.



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
                case "A X" -> score += 3 + 0;
                case "A Y" -> score += 1 + 3;
                case "A Z" -> score += 2 + 6;

                case "B X" -> score += 1 + 0;
                case "B Y" -> score += 2 + 3;
                case "B Z" -> score += 3 + 6;

                case "C X" -> score += 2 + 0;
                case "C Y" -> score += 3 + 3;
                case "C Z" -> score += 1 + 6;
                default -> System.out.println("invalid character");
            }
        }
        System.out.println(score);

    }
}