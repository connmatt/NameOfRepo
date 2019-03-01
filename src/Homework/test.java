package Homework;

import java.util.Scanner;

public class test {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter either 1 for guessing or 2 for hint: ");
        String checkIfIts1or2 = scan.nextLine();
        System.out.println(checkIfIts1or2.equals("2"));
        while(true){
            if (!checkIfIts1or2.equals("1") && !checkIfIts1or2.equals("2")){
                System.out.println("Incorrect input");
                System.out.println("Enter either 1 for guessing or 2 for hint: ");
                checkIfIts1or2 = scan.nextLine();
            }
            else {
                break;
            }
        }
    }
}
