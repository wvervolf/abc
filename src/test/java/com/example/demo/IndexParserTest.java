package com.example.demo;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexParserTest {
    @Test
    public void testParseIndexes() {
        String[] indexes = {"1,3-5", "2", "3-4"};
        List<List<Integer>> result = IndexParser.parseIndexes(indexes);
        assertEquals(3, result.size());
        assertArrayEquals(new Integer[]{1, 3, 4, 5}, result.get(0).toArray(new Integer[0]));
        assertArrayEquals(new Integer[]{2}, result.get(1).toArray(new Integer[0]));
        assertArrayEquals(new Integer[]{3, 4}, result.get(2).toArray(new Integer[0]));
    }
}