package Assignments;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your array's length");
        int length= scan.nextInt();
        int []arr=new int[length];
        System.out.println(getEvenCount(arr));
    }public static int getEvenCount(int []arr){
        int countOfEven=0;
        for (int i = 0; i < arr.length; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter your array's elements");
            arr[i]= scan.nextInt();
            if(i%2==0){
                countOfEven++;
            }




        }

        return countOfEven;
    }
}
