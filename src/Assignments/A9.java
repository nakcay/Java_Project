package Assignments;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your array's length");
        int length = scan.nextInt();
        String array[]= new String[length];
        System.out.println(getWord(array));


    }
    public static String getWord(String[] array) {
        String result = "";
        //String []array={"apple",banana,lemon,orange,potato}
        for (int i = 0; i < array.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("write your string elements");
            array[i]= scan.nextLine();
            result+="\n"+array[i].substring(0,3);
            }

        return result;
    }
}
