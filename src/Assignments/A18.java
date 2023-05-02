package Assignments;

import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your array's length");
        int length= scan.nextInt();
        int[]arr=new int[length];
       getReversed(arr);

    }public static void getReversed(int []arr) {

        for (int i = 0; i < arr.length; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter your array's elements");
            arr[i]= scan.nextInt();

        }
        for (int i = 0; i <arr.length ; i++) {//1,2,3
            System.out.print(arr[(arr.length-1)-i]+",");
        }


    }
}
