package com.example.demo;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.*;

public class UniqueCombinationsGeneratorTest {
    @Test
    public void testGenerateUniqueCombinations() {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 3, 4, 5),
                Arrays.asList(2),
                Arrays.asList(3, 4)
        );
        Set<List<Integer>> result = UniqueCombinationsGenerator.generateUniqueCombinations(lists);
        assertEquals(8, result.size());
        assertTrue(result.contains(Arrays.asList(1, 2, 3)));
        assertTrue(result.contains(Arrays.asList(1, 2, 4)));
        assertTrue(result.contains(Arrays.asList(3, 2, 3)));
        assertTrue(result.contains(Arrays.asList(3, 2, 4)));
        assertTrue(result.contains(Arrays.asList(4, 2, 3)));
        assertTrue(result.contains(Arrays.asList(4, 2, 4)));
        assertTrue(result.contains(Arrays.asList(5, 2, 3)));
        assertTrue(result.contains(Arrays.asList(5, 2, 4)));
    }
}