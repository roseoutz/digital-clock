package org.example;

/**
 * packageName    : org.example
 * fileName       : MockTimeSource
 * author         : kimdonggyuuuuu
 * date           : 2022/07/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/22        kimdonggyuuuuu       최초 생성
 */
public class MockTimeSource extends Subject implements TimeSource {

    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.notifyObservers();
    }


    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }
}
