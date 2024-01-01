package com.kenzie.slidingwindow.distinctelements;

import java.util.*;

/**
 * Contains a problem that can be solved using the Sliding Window Technique.
 */
public class DistinctElements {

    /**
     * Given a list of integers, find the number of distinct elements in every subset of size k.
     * <p>
     * Example:
     * input = [1, 3, 4, 2, 2, 5, 2]
     * k = 3
     * <p>
     * result = [3, 3, 2, 2, 2]
     *
     * @param input - the list of integers from which to identify the distinct counts, size >= k
     * @param k     - the size of sublists that should be considered when calculating the distinct counts, k >= 1
     * @return a list of distinct counts ordered by the sublist they relate to - the count of distinct
     * elements for the sublist with items 0, 1, 2 should be first in the list followed by the
     * count for items 1, 2, 3
     */
    public static List<Integer> countDistinctElements(List<Integer> input, int k) {
        // TODO: Implement an algorithm that utilizes the sliding window technique

        List<Integer> result = new ArrayList<>();
        if (input == null || input.isEmpty() || k < 1) {
            return result;
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int distinctCount = 0;
        for (int i = 0; i < k; i++) {
            int currentElement = input.get(i);
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
            if (frequencyMap.get(currentElement) == 1) {
                distinctCount++;
            }
        }
        result.add(distinctCount);
        for (int i = k; i < input.size(); i++) {
            int leftElement = input.get(i - k);
            int rightElement = input.get(i);
            frequencyMap.put(leftElement, frequencyMap.get(leftElement) - 1);
            if (frequencyMap.get(leftElement) == 0) {
                distinctCount--;
            }
            frequencyMap.put(rightElement, frequencyMap.getOrDefault(rightElement, 0) + 1);
            if (frequencyMap.get(rightElement) == 1) {
                distinctCount++;
            }
            result.add(distinctCount);
        }
        return result;
    }
}
