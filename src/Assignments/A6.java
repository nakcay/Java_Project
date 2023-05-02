package Assignments;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your input");
       String input= scan.nextLine();
        System.out.println(getName(input));

    }public static String getName(String input){
       String first=input.substring(input.indexOf("firsName")+12,(input.lastIndexOf("lastName"))-4);

        String last=input.substring(input.indexOf("lastName")+12,input.lastIndexOf("}")-2);
        String firstAndLast="First name: "+first+ "\nLast Name: "+last;


        return firstAndLast;
    }


}//{“id”: 1934, “firsName”: “James”, “lastName”: “May” }