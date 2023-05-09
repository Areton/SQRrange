package ru.netology.SQRrange.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testCountSQR(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(min, max);

        Assertions.assertEquals(expected, actual);


    }
}
