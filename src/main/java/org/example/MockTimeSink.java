package org.example;

/**
 * packageName    : org.example
 * fileName       : MockTimeSink
 * author         : kimdonggyuuuuu
 * date           : 2022/07/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/22        kimdonggyuuuuu       최초 생성
 */
public class MockTimeSink implements Observer {

    private int hours, minutes, seconds;
    private TimeSource timeSource;

    public MockTimeSink(TimeSource timeSource) {
        this.timeSource = timeSource;
    }

    @Override
    public void update() {
        this.hours = this.timeSource.getHours();
        this.minutes = this.timeSource.getMinutes();
        this.seconds = this.timeSource.getSeconds();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
