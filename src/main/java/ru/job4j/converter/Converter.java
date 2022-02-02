package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float ineuro = 140;
        float expectedeuro = 2;
        float out1 = Converter.rubleToEuro(ineuro);
        boolean passed1 = expectedeuro == out1;
        float indollar = 140;
        float expecteddollar = 3;
        float out2 = Converter.rubleToDollar(indollar);
        boolean passed2 = expecteddollar == out2;
        System.out.println("140 rubles are " + euro + " euro." + passed1);
        System.out.println("140 rubles are " + dollar + " dollar." + passed2);
    }
}
