package com.aristovga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Anagram {

    // Complete the anagram function below.
    static int anagram(String s) {
        int result = 0;

        StringBuilder input = new StringBuilder(s);
        StringBuilder first = new StringBuilder(input.substring(0, input.length()/2));
        StringBuilder second = new StringBuilder(input.substring(input.length()/2));
        if(first.length() != second.length())
            return -1;

        int[]  charsFirst = new int[26];
        int[]  charsSecond = new int[26];
        for (int i =0; i< first.length();i++)
        {
            charsFirst[first.charAt(i)-'a']++;
            charsSecond[second.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++)
        {
            result+= Math.abs(charsFirst[i]-charsSecond[i]);
        }


        return result/2;
    }

    private static final InputStreamReader isr=new InputStreamReader(System.in);

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(isr);
        int q = Integer.valueOf(br.readLine());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = br.readLine();

            System.out.println( anagram(s));
        }

    }
}
