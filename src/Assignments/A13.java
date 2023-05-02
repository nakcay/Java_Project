package Assignments;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your array's length");
        int length= scan.nextInt();
        int[]arr=new int[length];
        System.out.println(getSum(arr));

    }public static int getSum(int []arr){
        int sum =0;
        for (int i = 0;  i<arr.length ; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter your array's elements");
            arr [i]= scan.nextInt();
            sum+=arr[i];



        }
        return sum;
    }
}
