package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(
                "C:\\Users\\domin\\Downloads\\Advent of Code\\AdventOfCode3\\src\\main\\java\\org\\example\\input.txt");

        // hashmap of letters and scores
        Map<Character, Integer> scoreMap = new HashMap<>();
        // Add lowercase letters
        for (char c = 'a'; c <= 'z'; c++) {
            scoreMap.put(c, c - 'a' + 1);
        }
        // Add uppercase letters
        for (char c = 'A'; c <= 'Z'; c++) {
            scoreMap.put(c, c - 'A' + 1 + 26);
        }

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring variables
        String st;
        int sum = 0;
        int count = 0;
        int halfLength;

        List<Set<Character>> listOfSets = new ArrayList<>();

        listOfSets.add(new HashSet<>());
        listOfSets.add(new HashSet<>());

        while ((st = br.readLine()) != null) {

            listOfSets.get(0).clear();
            listOfSets.get(1).clear();

            halfLength = (st.length() / 2);

            count = 0;

            for (char c : st.toCharArray()) {
                if (count < halfLength){
                    listOfSets.get(0).add(c);
                }
                else {
                    listOfSets.get(1).add(c);
                }
                count++;
            }

            listOfSets.get(0).retainAll(listOfSets.get(1));
            sum += scoreMap.get(listOfSets.get(0).stream().findFirst().get());
        }
        System.out.println(sum);
        // fake unit test: correct answer: 8401
    }
}