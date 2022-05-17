package com.bridgelabzz;

import org.junit.jupiter.api.Test;

public class MoodAnalyser1 {
    String message;


    public static String analyzeMood(String message) {
        try {
            if (message.contains("Sad")){
                return "SAD";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
            return null;
        }
    }
