package Assignments;

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your array's length");
        int length= scan.nextInt();
        int[] array=new int[length];
        System.out.println(getSingle(array));

    }
    public static int getSingle(int[] array){
        int single=0;
        for (int i = 0; i < array.length; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter the elements");
            array[i]=scan.nextInt();
        }
        int previous=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=previous && array[i]!=array[i+1]){
                single=array[i];
            }
            previous=array[i];
        }
        return single;
    }
    }

