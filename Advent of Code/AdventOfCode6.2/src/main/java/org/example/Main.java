package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\domin\\Downloads\\Advent of Code\\AdventOfCode6.2\\src\\main\\java\\org\\example\\input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        int ch;
        int count = 0;

        ArrayList<Character> charList = new ArrayList<>();

        while ((ch = br.read()) != -1) {

            if (charList.size() == 14){
                Set<Character> charSet = new HashSet<>(charList);
                if (charSet.size() == charList.size()){
                    System.out.println(charList);
                    System.out.println(count);
                    break;
                    // fake unit test = 3697
                }
                charList.remove(0);
                charList.add((char) ch);

            } else {
                charList.add((char) ch);
            }
            count++;

        }
    }
}
