package com.kenzie.greedy.meetingroom;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingRoomTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void getMaximumMeetings(List<Meeting> inputList, int expected) {
        int result = MeetingRoom.getMaximumMeetings(inputList);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(generateMeetings(
                Arrays.asList(1,2,3,1,5,4),
                Arrays.asList(5,4,5,2,6,7)), 3),
            Arguments.of(generateMeetings(
                Arrays.asList(1,3,5,1,4,3),
                Arrays.asList(14,12,13,10,15,7)), 1),
            Arguments.of(generateMeetings(
                Arrays.asList(3,5,9,1,7,11),
                Arrays.asList(4,6,10,2,8,12)), 6),
            Arguments.of(generateMeetings(
                Arrays.asList(1),
                Arrays.asList(2)), 1),
            Arguments.of(generateMeetings(
                Arrays.asList(2,2,2,2),
                Arrays.asList(3,6,5,4)), 1),
            Arguments.of(generateMeetings(
                Arrays.asList(5,3,1,2,4),
                Arrays.asList(6,6,6,6,6)), 1),
            Arguments.of(generateMeetings(
                Arrays.asList(1,10,2,8),
                Arrays.asList(10,20,8,16)), 2)
        );
    }

    static List<Meeting> generateMeetings(List<Integer> startTimes, List<Integer> endTimes) {
        List<Meeting> meetings = new ArrayList<>();
        final String meetingNamePrefix = "meeting";

        for (int i = 0; i < startTimes.size(); i++) {
            Meeting meeting = new Meeting(meetingNamePrefix + i, startTimes.get(i), endTimes.get(i));
            meetings.add(meeting);
        }
        return meetings;
    }
}
