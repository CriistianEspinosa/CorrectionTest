package com.example.program3;

import java.util.List;

class WinsGame {
    public static void main(String[] args) {
        System.out.print("STONE, PAPER AND SCISSORS PROGRAM     ");
        String[] plays = {"R", "S", "S", "R", "P", "S"};

        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        for (String jugada : plays) {
            if (plays.equals("R") && plays[1].equals("S")) {
                scorePlayer1++;
            } else if (jugada.equals("S") && plays[1].equals("P")) {
                scorePlayer1++;
            } else if (jugada.equals("P") && plays[1].equals("R")) {
                scorePlayer1++;
            } else {
                scorePlayer2++;
            }
        }

        if (scorePlayer1 > scorePlayer2) {
            System.out.println(" Player 1 wins");
        } else if (scorePlayer2 > scorePlayer1) {
            System.out.println(" Player 2 wins");
        } else {
            System.out.println(" Tie");
        }
    }
}
