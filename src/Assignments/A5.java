package Assignments;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write your number");
        int n= scan.nextInt();
        getTriangle(n);


    }public static void getTriangle(int n) {
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }
}