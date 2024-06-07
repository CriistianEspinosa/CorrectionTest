package com.example.program4;

public class HelloApplication {
    public static void main(String[] args) {
        System.out.print("PROGRAM TO CALCULATE COORDINATES     ");

        int[] steps = {10, 5, -2};
        int x = 0, y = 0;
        for (int step : steps) {
            if (step > 0) {
                y += step;
            } else {
                y -= Math.abs(step);
            }
            x -= step;
        }
        System.out.println("Result final coordinates: (" + x + ", " + y + ")");
    }
}

