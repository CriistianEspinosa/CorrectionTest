package com.example.program1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.print("PROGRAM THAT REPLACES MULTIPLES OF 3, 5 AND BOTH");
        for (int Number = 1; Number <= 100; Number++) {
            String output = "";
            if (Number % 3 == 0) {
                output += "fizz";
            }
            if (Number % 5 == 0) {
                output += "buzz";
            }
            if (output.isEmpty()) {
                output = Integer.toString(Number);
            }
            System.out.println(output);
        }
    }
}
