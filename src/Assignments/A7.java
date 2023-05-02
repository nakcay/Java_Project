package Assignments;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your input");
        String input = scan.nextLine();
        input = input.toLowerCase();
        System.out.println(getVowels(input));

    }

    public static String getVowels(String input) {
    String vowels="";


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                System.out.print(input.charAt(i));

            }


        }


        return vowels;
    }}