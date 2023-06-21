package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<List<Character>> nestedLists = new ArrayList<>();

        nestedLists.add(new ArrayList<>(Arrays.asList('R', 'S', 'L', 'F', 'Q')));
        nestedLists.add(new ArrayList<>(Arrays.asList('N', 'Z', 'Q', 'G', 'P', 'T')));
        nestedLists.add(new ArrayList<>(Arrays.asList('S', 'M', 'Q', 'B')));
        nestedLists.add(new ArrayList<>(Arrays.asList('T', 'G', 'Z', 'J', 'H', 'C', 'B', 'Q')));
        nestedLists.add(new ArrayList<>(Arrays.asList('P', 'H', 'M', 'B', 'N', 'F', 'S')));
        nestedLists.add(new ArrayList<>(Arrays.asList('P', 'C', 'Q', 'N', 'S', 'L', 'V', 'G')));
        nestedLists.add(new ArrayList<>(Arrays.asList('W', 'C', 'F')));
        nestedLists.add(new ArrayList<>(Arrays.asList('Q', 'H', 'G', 'Z', 'W', 'V', 'P', 'M')));
        nestedLists.add(new ArrayList<>(Arrays.asList('G', 'Z', 'D', 'L', 'C', 'N', 'R')));

        File file = new File("C:\\Users\\domin\\Downloads\\Advent of Code\\AdventOfCode5\\src\\main\\java\\org\\example\\input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        int amount;
        int origin;
        int destination;

        while ((st = br.readLine()) != null) {

            String[] parts = st.split(" ");
            amount = Integer.parseInt(parts[1]);
            origin = Integer.parseInt(parts[3]) - 1;
            destination = Integer.parseInt(parts[5]) - 1;

            for (int i = 0; i < amount; i++) {
                List<Character> originList = nestedLists.get(origin);
                List<Character> destinationList = nestedLists.get(destination);

                destinationList.add(originList.get(originList.size() - 1));
                originList.remove(originList.size() - 1);
            }
        }

        // Printing the nested lists
        for (List<Character> nestedList : nestedLists) {
            System.out.println(nestedList);
        }
    }
}
