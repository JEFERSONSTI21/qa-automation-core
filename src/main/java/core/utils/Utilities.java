package core.utils;

import com.github.javafaker.Faker;

public class Utilities {


    public  String GenerateLastNameRandom() {
        Faker faker = new Faker();
        String middleName = faker.name().firstName();
        return middleName;
    }

    public  String GenerateSurnameRandom() {
        Faker faker = new Faker();
        String firstSurName = faker.name().lastName();
        String[] parte1 = firstSurName.split(" ");
        String firstSurNamefinal = parte1[0];
        return firstSurNamefinal;
    }

    public  String GenerateNumRamdomSalary() {
        Faker faker = new Faker();
        int numFaker = faker.number().numberBetween(1000000, 3000000);
        String numFakerFinal = String.valueOf(numFaker);
        return numFakerFinal;
    }

    public  String GenerateNumRamdomAge() {
        Faker faker = new Faker();
        int numFaker = faker.number().numberBetween(10, 50);
        String numFakerFinal = String.valueOf(numFaker);
        return numFakerFinal;
    }
}
