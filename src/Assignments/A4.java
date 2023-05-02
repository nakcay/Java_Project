package Assignments;

import java.util.Scanner;

public class A4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your input");
        String input= scan.nextLine();
        getId(input);

    }public static String getId(String input){
        //String id=input.substring(77,81);
        String id= input.substring(input.indexOf("p")+7, input.lastIndexOf("p")-5);
        if (input.contains("<html>")){
            System.out.println(id);
        }else {
            System.out.println("invalid input");
        }
        return id;
    }
}
//<!DOCTYPE html> <html> <head> <title> Java < /title> < /head> <body> <p id= “myid”> </p> </body> </html>