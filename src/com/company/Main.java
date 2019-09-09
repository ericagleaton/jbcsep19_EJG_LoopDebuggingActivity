/*
Loop debugging activity
The following program should allow the user to input as many things as they want until they stop. Each time it is supposed to repeat with what the user said, can you fix it?
 */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
              Scanner keyboard = new Scanner(System.in);
            String userInput = "";
        System.out.println("Hello, I am a Parrot Program\nType something and press enter, \nI will repeat until you simply press enter.");
            userInput = keyboard.next();
            while (userInput != "") {
                System.out.println(userInput);
                userInput = keyboard.next();}

          //  System.out.println("Good Bye, You Have Ended The Program");
    }
}

