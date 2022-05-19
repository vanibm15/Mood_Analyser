package com.bridgelabzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyser1Test extends MoodAnalyser1 {
    public class TestMoodAnalyser {

        public void givenMessage_SadMood_Should_Return_Sad() {
            MoodAnalyser1 moodAnalyzer = new MoodAnalyser1("I am In a Sad Mood");
            String mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD", mood);
        }
        @Test
        public void givenMessage_SadMood_Should_Return_Happy() {
            MoodAnalyser1 moodAnalyzer = new MoodAnalyser1("I am In a Sad Mood");
            String mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
        @Test
        public void givenMessage_AnyMood_Should_HandleException() {
            MoodAnalyser1 moodAnalyser = new MoodAnalyser1(null);
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
           }
      }


  }


