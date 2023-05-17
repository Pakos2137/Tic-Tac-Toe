package org.example;

import java.util.Random;

public class Rng {
    public int random1To9(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }
}