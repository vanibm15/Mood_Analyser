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

    public static String analyzeMood1(String message) {
        if (message.contains("Iam in sad mood")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return null;
        }

    }

    public static String analyzeMood2(String message) {
        if (message.contains("Iam in any mood")) {
            return "happy";
        } else if (message.contains("SAD")) {
            return "SAD";
        } else {
            return null;
        }

    }
}
