package com.zaycodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prompt the user
        System.out.println("Welcome to the Dream Corps Calculator! Type two numbers!");
        //Create 2 number variables

        int num1;
        int num2;
        String cont;
        //Create operand variable
        do {
        String oper1;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        //Prompt for operand
        System.out.println("Now pick an operand!");
        oper1 = sc.next();
        //If-else statements + Do-while

            if (oper1.equals("+")) {
                int answer = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + answer);
            } else if (oper1.equals("-")) {
                int answer = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + answer);
            } else if (oper1.equals("*")) {
                int answer = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + answer);
            } else if (oper1.equals("/")) {
                int answer = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + answer);
            } else {
                System.out.println("Error!");
            }
            System.out.println("Do you wish to continue? Y/N");
            cont = sc.next();
        } while (cont.equals("y"));
        //output the answer
        // write your code here
    }

}
