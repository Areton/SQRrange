package ru.netology.SQRrange.services;

public class SQRService {
    public int calcSqr(int min, int max) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int x = i*i;
            if (x < min) {}
            else if (x > max) {}
            else {
                count = count +1;
            }
        }

        return count;
    }

}
