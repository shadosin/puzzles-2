package com.kenzie.greedy.backpacking;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackpackingTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void getMaximumSnacks(List<Snack> inputList, int weight, int expected) {
        int result = Backpacking.getMaximumSnacks(inputList, weight);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(generateSnacks(Arrays.asList(1,2,3,4,5,6,7)), 8, 3),
            Arguments.of(generateSnacks(Arrays.asList(7,6,5,4,3,2,1)), 8, 3),
            Arguments.of(generateSnacks(Arrays.asList(3,7,10)), 2, 0),
            Arguments.of(generateSnacks(Arrays.asList(1,3,2,6,4,7,8,10,12)), 100, 9),
            Arguments.of(generateSnacks(Arrays.asList(50)), 50, 1),
            Arguments.of(generateSnacks(Arrays.asList(13,15,11,1)), 10, 1),
            Arguments.of(generateSnacks(Arrays.asList(45)), 44, 0),
            Arguments.of(generateSnacks(Arrays.asList(5,3,9,10,2)), 10, 3)
        );
    }

    static List<Snack> generateSnacks(List<Integer> weights) {
        List<Snack> snacks = new ArrayList<>();
        final String snackPrefix = "snack";

        for (int i = 0; i < weights.size(); i++) {
            Snack snack = new Snack(snackPrefix+i, weights.get(i));
            snacks.add(snack);
        }
        return snacks;
    }
}
