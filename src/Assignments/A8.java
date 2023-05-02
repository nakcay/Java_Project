package Assignments;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your number");
        int num= scan.nextInt();
        getDigits(num);

    }public static void getDigits(int num ) {//2365
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            Character character;
            int j =Character.digit(number.charAt(i),10);
            System.out.println("Display promt: " + j);
        }



    }
    }



