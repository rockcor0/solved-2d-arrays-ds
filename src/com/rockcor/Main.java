package com.rockcor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Main {

    public static void main(String[] args) {
        hourglassSum(generateMatrix());
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                max = Math.max(
                        arr.get(i).get(j)
                                + arr.get(i).get(j + 1)
                                + arr.get(i).get(j + 2)
                                + arr.get(i + 1).get(j + 1)
                                + arr.get(i + 2).get(j)
                                + arr.get(i + 2).get(j + 1)
                                + arr.get(i + 2).get(j + 2),
                        max);
            }
        }
        System.out.println(max);
        return max;

    }

    private static List<List<Integer>> generateMatrix() {
        List<List<Integer>> exterior = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            List<Integer> interior = new ArrayList<>();
            Random r = new Random();
            for (int j = 0; j < 6; j++) {
                interior.add(r.nextInt(10));
            }
            exterior.add(interior);
        }
        System.out.println(exterior);

        return exterior;
    }
}
