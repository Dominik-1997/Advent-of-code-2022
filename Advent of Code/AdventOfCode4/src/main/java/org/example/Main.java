package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

            File file = new File(
                    "C:\\Users\\domin\\Downloads\\Advent of Code\\AdventOfCode4\\src\\main\\java\\org\\example\\input.txt");

            // Creating an object of BufferedReader class
            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            // Declaring variables
            String st;

            int deltaX;
            int deltaY;

            int count = 0;

            while ((st = br.readLine()) != null) {

                String[] parts = st.split(",");

                String[] left = parts[0].split("-");
                String[] right = parts[1].split("-");

                deltaX = Integer.parseInt(left[0]) - Integer.parseInt(right[0]);
                deltaY = Integer.parseInt(left[1]) - Integer.parseInt(right[1]);

                if (deltaX <= 0 && deltaY >= 0) count++;
                else if (deltaX >= 0 && deltaY <= 0) count++;
            }
        System.out.println(count);
    }
}