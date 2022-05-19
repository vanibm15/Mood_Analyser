package com.bridgelabzz;

import org.junit.jupiter.api.Test;

public class MoodAnalyser1 {
    private String message;

    /*
     * used default as well as parameterized constructor and defined the function
     * which return the value as happy and sad.
     */
    public MoodAnalyser1() {
    }

    public MoodAnalyser1(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {

            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            if (message == null)
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.NULL);
            else
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.EMPTY);
        }
    }
}



}