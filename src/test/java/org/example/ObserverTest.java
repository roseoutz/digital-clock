package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * packageName    : org.example
 * fileName       : ClockDriverTest
 * author         : kimdonggyuuuuu
 * date           : 2022/07/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/22        kimdonggyuuuuu       최초 생성
 */
public class ObserverTest {

    private static MockTimeSource timeSource;
    private static MockTimeSink sink;

    @BeforeAll
    public static void setUp() {
        timeSource = new MockTimeSource();
        sink = new MockTimeSink(timeSource);
        timeSource.registerObserver(sink);
    }

    private void assertSinkEquals(MockTimeSink sink, int hours, int minutes, int seconds) {
        assertEquals(hours, sink.getHours());
        assertEquals(minutes, sink.getMinutes());
        assertEquals(seconds, sink.getSeconds());
    }

    @Test
    void testTimeChange() {
        timeSource.setTime(3,4,5);
        assertSinkEquals(sink, 3,4,5);

        timeSource.setTime(7,8,9);
        assertSinkEquals(sink, 7,8, 9);
    }

    @Test
    void testMultipleSinks() {
        MockTimeSink sink1 = new MockTimeSink(timeSource);
        timeSource.registerObserver(sink1);

        timeSource.setTime(12, 13, 14);
        assertSinkEquals(sink, 12, 13, 14);
        assertSinkEquals(sink1, 12,13,14);
    }
}
