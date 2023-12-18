package com.kenzie.slidingwindow.distinctelements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctElementsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void countDistinctElements(List<Integer> inputList, int k, List<Integer> expected) {
        List<Integer> result = DistinctElements.countDistinctElements(inputList, k);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), 1, Arrays.asList(1, 1, 1, 1, 1, 1)),
            Arguments.of(Arrays.asList(2, 3, 4, 5, 6, 1), 2, Arrays.asList(2, 2, 2, 2, 2)),
            Arguments.of(Arrays.asList(2, 2, 3, 3, 4, 4), 2, Arrays.asList(1, 2, 1, 2, 1)),
            Arguments.of(Arrays.asList(2, 3, 1, 2, 4, 5, 4), 4, Arrays.asList(3, 4, 4, 3)),
            Arguments.of(Arrays.asList(1, 1, 3, 4, 5, 6), 6, Arrays.asList(5)),
            Arguments.of(Arrays.asList(1, 1, 1, 1, 1, 1), 6, Arrays.asList(1)),
            Arguments.of(Arrays.asList(1, 2, 3, 1, 2, 3), 3, Arrays.asList(3, 3, 3, 3))
        );
    }
}
