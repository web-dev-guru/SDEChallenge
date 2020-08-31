package com.code.impl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class MovingAverageTest {
    @DisplayName("Test movingAverageTest.getAverage()")
    @Test
    public void movingAverageTest() {
        MovingAverage ma= new MovingAverage(3);
        assertEquals(3.0,ma.getAverage(3.0));
        assertEquals(3.5,ma.getAverage(4.0));




    }

}