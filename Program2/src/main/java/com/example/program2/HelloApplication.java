package com.example.program2;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        System.out.print("PROGRAM TO GENERATE A LADDER  ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of steps of your staircase:");
        int stepsLadder = scanner.nextInt();
        if (stepsLadder==0){
            System.out.println("__");
            return;
        }
        StringBuilder staircase=new StringBuilder();
        boolean ascendingfromlefttoright = stepsLadder>0;

        int numSteps=Math.abs(stepsLadder);

        for(int i =0;i<numSteps;i++){
            for (int j =0;j<numSteps-i-1;j++){
                staircase.append(ascendingfromlefttoright ?" ":"_");
            }
            staircase.append("_|");
            staircase.append(System.lineSeparator());
        }
        System.out.println(staircase.toString());
    }
}
