package Assignments;

import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your array's length");
        int length = scan.nextInt();
        String[] array = new String[length];
        System.out.println(getMerged(array));

    }

    public static String getMerged(String[] array) {
        String merge = "";
        for (int i = 0; i < array.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your array's elements");
            array[i] = scan.nextLine();
        }
            if (array[0].charAt(array[0].length()-1)==array[1].charAt(0)){
                merge += array[0]+ array[1].substring(1);
            }else{
                merge += array[0]+array[1];
            }
            return merge;
    }

}