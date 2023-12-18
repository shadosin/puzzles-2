package com.kenzie.twopointer.containerwithmostwater;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void containerWithMostWaterTest(int[] input, int expected) {
        int result = ContainerWithMostWater.maxArea(input);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 3, 4, 5, 6 }, 9),
                Arguments.of(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[] { 1, 3, 4, 2, 8, 5, 3 }, 15),
                Arguments.of(new int[] { 9, 9, 9, 9, 9, 9, 9 }, 54),
                Arguments.of(new int[] { 1, 1 }, 1),
                Arguments.of(new int[] { 0, 1 }, 0),
                Arguments.of(new int[] { 4, 3, 2, 1, 4 }, 16),
                Arguments.of(new int[] { 1, 2, 1 }, 2)
        );
    }
}
