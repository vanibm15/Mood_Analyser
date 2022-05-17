package com.bridgelabzz;

import org.junit.jupiter.api.Test;

public class MoodAnalyser1 {
   String message;


    public static String analyzeMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return null;
        }
    }
}
