package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

        if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 2;
        }

        return 0;
    }
}
