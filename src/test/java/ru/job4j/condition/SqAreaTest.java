package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void when62squareThen2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when53squareThen1dot17() {
        double expected = 1.17;
        int p = 5;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1015squareThen1dot46() {
        double expected = 1.46;
        int p = 10;
        int k = 15;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}