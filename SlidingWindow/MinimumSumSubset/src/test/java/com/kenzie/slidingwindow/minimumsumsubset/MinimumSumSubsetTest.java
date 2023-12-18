package com.kenzie.slidingwindow.minimumsumsubset;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSumSubsetTest {


    @ParameterizedTest
    @MethodSource("testCases")
    public void findMinimumSumTest(List<Integer> inputList, int k, int expected) {
        int result = MinimumSumSubset.findMinimumSum(inputList, k);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), 2, 3),
            Arguments.of(Arrays.asList(1, 2, 3, 1, 1, 6), 2, 2),
            Arguments.of(Arrays.asList(1, 3, 4, 2, 8, 5, 3), 3, 8),
            Arguments.of(Arrays.asList(1, 3, 4, 2, 8, 5, 3), 5, 18),
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), 1, 1),
            Arguments.of(Arrays.asList(2, 3, 4, 5, 6, 1), 1, 1),
            Arguments.of(Arrays.asList(2, 3, 1, 4, 5, 6), 1, 1),
            Arguments.of(Arrays.asList(2, 3, 1, -2, 4, 5, 6), 1, -2),
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), 2, 3),
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), 6, 21)
        );
    }
}
