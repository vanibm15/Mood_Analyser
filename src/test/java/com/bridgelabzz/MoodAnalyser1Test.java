package com.bridgelabzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MoodAnayser1Test {


    public void MoodAnalyserTest(String i_am_in_happy_mood) {
        super(i_am_in_happy_mood);
    }

    @Test
    public void givenMessage_SadMood_Should_Return_Sad() {
        MoodAnalyser1 moodAnalyzer = new MoodAnalyser1("I am In a Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser1 moodAnalyser = new MoodAnalyser1("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}

