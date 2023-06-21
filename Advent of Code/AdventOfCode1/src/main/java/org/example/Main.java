package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // Input file path
        File file = new File(
                "C:\\Users\\domin\\Downloads\\Advent of Code\\AdventOfCode1\\src\\main\\java\\org\\example\\input.txt");

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        int maxValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        int currentValue = 0;

        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
            if (st.equals("")) {
                if (currentValue > maxValue) {
                    thirdValue = secondValue;
                    secondValue = maxValue;
                    maxValue = currentValue;
                }
                else if (currentValue > secondValue) {
                    thirdValue = secondValue;
                    secondValue = currentValue;
                }
                else if (currentValue > thirdValue) {
                    thirdValue = currentValue;
                }
                currentValue = 0;
            } else {
                currentValue += Integer.parseInt(st);
            }
        }
        // Print top 3 values
        System.out.println("3 biggest values:");
        System.out.println(maxValue);
        System.out.println(secondValue);
        System.out.println(thirdValue);
        System.out.println("Sum: " + (maxValue + secondValue + thirdValue));
    }
}