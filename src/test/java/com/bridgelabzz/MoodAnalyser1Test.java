package com.bridgelabzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyser1Test extends MoodAnalyser1 {

    @Test
    void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser1 mood = new MoodAnalyser1();
        String result = MoodAnalyser1.analyzeMood("Sad");
        assertEquals("SAD", result);
    }
}
