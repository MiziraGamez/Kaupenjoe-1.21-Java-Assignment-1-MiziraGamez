package net.miziragamez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* TRIVIA ASSIGNMENT */

        //MY ATTEMPTS BELOW

        int answer1;
        int answer2;
        String answer3;
        int score = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Question 1:");
        System.out.println("How many different elemental types are in Pokemon? Answer with an integer.");
        answer1 = scanner.nextInt();
        if (answer1 == 18) {
            score++;
            System.out.println("Good job! You got the question right!");
        } else {
            System.out.println("Oh no... The correct answer was 18.");
        }
        System.out.println("");
        System.out.println("Question 2:");
        System.out.println("How many playable characters are there in Super Smash Bros Ultimate (including Echo Fighters)? Answer with an integer.");
        answer2 = scanner.nextInt();
        if (answer2 == 89) {
            score++;
            System.out.println("Amazing job! You got the question right!");
        } else {
            System.out.println("Oh no... The correct answer was 89.");
        }
        System.out.println("");
        System.out.println("Question 3:");
        System.out.println("Answer TRUE or FALSE to the following statement: This code should ideally work, lol.");
        answer3 = scanner.next();
        switch (answer3) {
            case "TRUE", "True", "true" -> {
                score++;
                System.out.println("Awesome job! You got the question right!");
            }
            case null, default -> {
                System.out.println("Oh no... The statement was actually TRUE/True/true.");
            }
        }

        System.out.println("");
        System.out.println("Final Score:");
        System.out.println( + score + " out of 3 correct.");

        if(score == 3) {
            System.out.println("Perfect! You got everything right!");
        } else if (score == 2) {
            System.out.println("Only one mistake is still worth celebrating!");
        } else if (score == 1) {
            System.out.println("Just one correct... better luck next time!");
        } else if (score == 0) {
            System.out.println("Oh no! Maybe try again?");
        }

    }
}
