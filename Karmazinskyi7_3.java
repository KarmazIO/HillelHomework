package com.karmazinskyi.lessons.lesson7;

import java.util.Arrays;

public class Karmazinskyi7_3 {
    public static void main(String[] args) {
        int[] source = {33, 22, 11, 0};
        int[] target = {66, 55, 44};
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target));

        int[] result = new int [source.length + target.length];
        System.arraycopy(target, 0, result, 0, target.length);
        System.arraycopy(source, 0, result, target.length, source.length);
        target = result;

        System.out.println("Target (result): " + Arrays.toString(target));
    }
}
