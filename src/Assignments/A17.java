package Assignments;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your array's length");
        int length= scan.nextInt();
        String []arr=new String[length];
        System.out.println(getLongestWord(arr));

    }public static String getLongestWord(String[]arr) {
        String longestWord = "";
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your array's elements");
            arr[i] = scan.nextLine();
            if (longestWord.length()<arr[i].length()) {
                longestWord = arr[i];
            }

        }
        return longestWord;
    }}


