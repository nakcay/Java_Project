package Assignments;


import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str = scan.nextLine();
        System.out.println(isEqual(str));


    }

    public static boolean isEqual(String str) {
        boolean isEqual=true;
        int numberOfJava = 0;
        int numberOfPython = 0;
        String word1="java";
        String word2="python";
        for (int i = 0; i <=str.length()-word1.length() ; i++) {
            if(word1.equals(str.substring(i,i+word1.length()))){
                numberOfJava++;
            }
        }
        for (int i = 0; i <=str.length()-word2.length() ; i++) {
            if(word2.equals(str.substring(i,i+word2.length()))){
                numberOfPython++;
            }
        }
        if(numberOfJava==numberOfPython){
           isEqual=true;
        }else{
            isEqual=false;
        }

        return isEqual;
    }
}






