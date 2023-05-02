package Assignments;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        scan.nextLine();
        String arr[] = new String[length];
        System.out.println(getPairs(arr));

    }

    public static String getPairs(String arr[]){
        String result="";
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter elements");
            arr[i] = scan.nextLine();

        }

        for (int i = 0; i < arr.length; i+=2) {
            result=result + arr[i] + " , " + arr[i+1] + "\n";

        }

        return result;
    }
}

