package com.kenzie.twopointer.threesum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreeSumUniqueTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void threeSumTest(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> result = ThreeSumUnique.threeSum(nums);
        assertTrue(checkTriplets(expected, result), "Expected: " + Arrays.toString(expected.toArray()) +
                " Actual: " + Arrays.toString(result.toArray()));
    }

    static boolean checkTriplets(List<List<Integer>> expected, List<List<Integer>> result) {
        Set<Set<Integer>> expectedSet = new HashSet<>();
        for (List<Integer> expectedList : expected) {
            expectedSet.add(new HashSet<>(expectedList));
        }

        Set<Set<Integer>> resultSet = new HashSet<>();
        for (List<Integer> resultList : result) {
            resultSet.add(new HashSet<>(resultList));
        }
        return expectedSet.equals(resultSet);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[] { -1, 0, 1, 3, 2, -4 },
                        Arrays.asList(
                                Arrays.asList(-4 ,1, 3),
                                Arrays.asList(-1, 0, 1))),
                Arguments.of(new int[] { 0, 1, 2, 3 },
                        Collections.emptyList()),
                Arguments.of(new int[] { },
                        Collections.emptyList()),
                Arguments.of(new int[] { 0 },
                        Collections.emptyList()),
                Arguments.of(new int[] { -1, 0, 1 },
                        Arrays.asList(
                                Arrays.asList(-1, 0, 1))),
                Arguments.of(new int[] { -5, -1, 0, 1, 5 },
                        Arrays.asList(
                                Arrays.asList(-1, 0, 1),
                                Arrays.asList(-5, 0, 5))),
                Arguments.of(new int[] { -5, -1, 0, 1, -2, 5, 7, -10, 3, 291, 47, -9, 2, -7, 90, 17, -82, 43, -25, -23, -21 },
                        Arrays.asList(
                                Arrays.asList(-10, -7, 17),
                                Arrays.asList(-10, 3, 7),
                                Arrays.asList(-9, 2, 7),
                                Arrays.asList(-7, 0, 7),
                                Arrays.asList(-7, 2, 5),
                                Arrays.asList(-5, -2, 7),
                                Arrays.asList(-5, 0, 5),
                                Arrays.asList(-5, 2, 3),
                                Arrays.asList(-2, -1, 3),
                                Arrays.asList(-2, 0, 2),
                                Arrays.asList(-1, 0, 1)))
        );
    }
}
