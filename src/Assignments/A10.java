package Assignments;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your string array's length");
        int length= scan.nextInt();
        scan.nextLine();
        String[]arr=new String[length];
        System.out.println(getWord(arr));

    }public static String getWord(String[]arr){
        String result="";
        for (int i = 0; i < arr.length; i++) {
            Scanner scan =new Scanner(System.in);
            System.out.println("enter your elements");
            arr[i]= scan.nextLine();
          result+="\n"+ arr[i].charAt(0)+arr[i].charAt(arr[i].length()-1);
        }
        return result;
    }
}
