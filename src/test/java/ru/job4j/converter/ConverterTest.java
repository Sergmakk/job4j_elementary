package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float ineuro = 210;
        float expectedeuro = 3;
        float out1 = Converter.rubleToEuro(ineuro);
        float eps1 =  0.0001f;
        Assert.assertEquals(expectedeuro, out1, eps1);;
    }

    @Test
    public void rubleToDollar() {
        float indollar = 600;
        float expecteddollar = 10;
        float out2 = Converter.rubleToDollar(indollar);
        float eps2 = 0.0001f;
        Assert.assertEquals(expecteddollar, out2, eps2);
    }
}