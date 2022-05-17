package com.bridgelabzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyser1Test extends MoodAnalyser1 {
    public class TestMoodAnalyser {

        @Test
        public void givenNullMood_ShouldThrowException() {
            MoodAnalyser1 moodAnalyser = new MoodAnalyser1();
            String mood = moodAnalyser.analyzeMood(null);
            assertEquals("HAPPY", mood);
            System.out.println(mood);

        }
    }

}