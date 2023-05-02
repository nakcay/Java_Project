package Assignments;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your arrays length");
        int length= scan.nextInt();
        int []array=new int[length];
        System.out.println(getTotal(array));



    }public static int getTotal(int []array){
        int total=0;
        for (int i = 0; i <array.length ; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter your arrays elements");
            array [i]=scan.nextInt();
            total=total+array[i]*array[i];
            System.out.println(total);

        }

        return total;
    }
}
