package com.kenzie.slidingwindow.distinctelements;

import java.util.Collections;
import java.util.List;

/**
 * Contains a problem that can be solved using the Sliding Window Technique.
 */
public class DistinctElements {

    /**
     * Given a list of integers, find the number of distinct elements in every subset of size k.
     *
     * Example:
     *   input = [1, 3, 4, 2, 2, 5, 2]
     *   k = 3
     *
     *   result = [3, 3, 2, 2, 2]
     *
     * @param input - the list of integers from which to identify the distinct counts, size >= k
     * @param k - the size of sublists that should be considered when calculating the distinct counts, k >= 1
     * @return a list of distinct counts ordered by the sublist they relate to - the count of distinct
     *         elements for the sublist with items 0, 1, 2 should be first in the list followed by the
     *         count for items 1, 2, 3
     */
    public static List<Integer> countDistinctElements(List<Integer> input, int k) {
        // TODO: Implement an algorithm that utilizes the sliding window technique

        return Collections.emptyList();
    }

}
