/*
 * Copyright (c) 2021.
 *
 * @author Tochie
 *
 * Date 9/9/21, 1:06 PM
 */

package com.utils;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utils {

    public static List<Integer> generateRandomNumberList(int size, int min, int max){

        return IntStream.range(0, size)
                .mapToObj(i -> ThreadLocalRandom.current().nextInt(min, max + 1))
                .collect(Collectors.toList());
    }

    public static List<Integer> generateSortedRandomNumberList(int size, int min, int max){

        return IntStream.range(0, size)
                .mapToObj(i -> ThreadLocalRandom.current().nextInt(min, max + 1))
                .sorted()
                .collect(Collectors.toList());
    }

    public static int[] generateRandomNumberArray(int size, int min, int max){

        return generateRandomNumberList(size, min, max)
                .stream().mapToInt(i -> i).toArray();
    }

    public static int[] generateSortedRandomNumberArray(int size, int min, int max){

        return generateRandomNumberList(size, min, max)
                .stream().mapToInt(i -> i).sorted().toArray();
    }


    public static int[] generateRandomNumberArray(int size){

        return generateRandomNumberList(size, Integer.MIN_VALUE, Integer.MIN_VALUE)
                .stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> generateRandomNumberList(int size){

        return generateRandomNumberList(size, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }


}
