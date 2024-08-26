package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCombinationsGenerator {
    public static Set<List<Integer>> generateUniqueCombinations(List<List<Integer>> lists) {
        Set<List<Integer>> result = new HashSet<>();
        generateCombinations(lists, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinations(List<List<Integer>> lists, int depth, List<Integer> current, Set<List<Integer>> result) {
        if (depth == lists.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (Integer number : lists.get(depth)) {
            current.add(number);
            generateCombinations(lists, depth + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
