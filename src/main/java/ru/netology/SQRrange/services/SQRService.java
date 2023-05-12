package ru.netology.SQRrange.services;

public class SQRService {
    public int calcSqr(int min, int max) {
        int count = 0;
        for (int i = 9; i < 100; i++) {
            int square = i * i;
            if (square >= min && square <= max) {
                count = count + 1;
            }
        }

        return count;
    }

}
