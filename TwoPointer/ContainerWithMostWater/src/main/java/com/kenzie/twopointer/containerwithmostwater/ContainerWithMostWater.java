package com.kenzie.twopointer.containerwithmostwater;

/**
 * Contains a problem that can be solved using the Two-Pointer Technique.
 */
public class ContainerWithMostWater {
    /**
     * Given a non-negative int array height, where the array index represents the x-axis coordinate, and the array
     * value represents the height of the vertical line drawn at that x-axis position, find the maximum amount of water
     * that can be contained by any two such vertical lines in the array.
     *
     * Example:
     *   height = [1,8,6,2,5,4,8,3,7]
     *   result = 49
     *
     *   The most amount of water can be held between the vertical lines at array index 1 and array index 8, because the
     *   width of this container is 7, and the height of this container (the shorter of the two lines) is 7, yielding
     *   a total capacity of 49.
     *
     *
     * The formula to calculate the amount of water that can be held is:
     *   Area = length of shorter vertical line * distance between lines
     *
     * @param height an array of non-negative integers representing vertical line height at a given x-axis position
     * @return the maximum area of water that can be contained by any two such vertical lines.
     */
    public static int maxArea(int[] height) {
        return -1;
    }
}
