package ru.mirea.lab3.obertki.ex1;

public class Main {
    public static void main(String[] args) {
        Double doubleObject2 = Double.valueOf("2.71828");
        Double doubleObject1 = Double.valueOf(3.14);

        String stringValue = "1.234";
        double parsedDouble = Double.parseDouble(stringValue);

        System.out.println("Значение doubleObject1: " + doubleObject1);
        System.out.println("Значение doubleObject2: " + doubleObject2);

        String d = Double.toString(3.14);
        System.out.println("Преобразование литерала double к строке: " + d);

        double primitiveDouble = doubleObject1.doubleValue();
        float primitiveFloat = doubleObject1.floatValue();
        int primitiveInt = doubleObject1.intValue();
        long primitiveLong = doubleObject1.longValue();
        short primitiveShort = doubleObject1.shortValue();
        byte primitiveByte = doubleObject1.byteValue();
    }
}

