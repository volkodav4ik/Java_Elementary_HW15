package com.volkodav4ik;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW15T1 {
    private static final Random RANDOM = new Random();
    private static final double MAX_VALUE = 10;
    private static final int QUANTITY_OF_LIST = 15;

    public static void main(String[] args) {
        double result = createAndInitList().stream().mapToDouble((d) -> d = Math.pow(d, 2)).average().getAsDouble();
        System.out.printf("Result of stream: %.2f", result);
    }

    private static List<Double> createAndInitList() {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < QUANTITY_OF_LIST; i++) {
            list.add(RANDOM.nextDouble() * MAX_VALUE);
        }
        return list;
    }
}
