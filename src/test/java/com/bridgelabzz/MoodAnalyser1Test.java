package com.bridgelabzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyser1Test extends MoodAnalyser1 {

    @Test
    void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser1 mood = new MoodAnalyser1();
        String result = MoodAnalyser1.analyzeMood("sad mood");
        assertEquals("SAD", result);
    }

    @Test
    void givenMessageWhenIamInSadMoodShouldReturnSad() {
        MoodAnalyser1 mood = new MoodAnalyser1();
        String result = MoodAnalyser1.analyzeMood1("Iam in sad mood");
        assertEquals("SAD", result);
    }
    @Test
    void givenMessageWhenIamInHappyMoodShouldReturnHappy() {
        MoodAnalyser1 mood = new MoodAnalyser1();
        String result = MoodAnalyser1.analyzeMood2("Iam in any mood");
        assertEquals("happy", result);
    }
}


