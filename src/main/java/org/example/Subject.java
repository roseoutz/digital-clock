package org.example;

import java.util.List;
import java.util.Vector;

/**
 * packageName    : org.example
 * fileName       : TimeSourceImpl
 * author         : kimdonggyuuuuu
 * date           : 2022/07/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/22        kimdonggyuuuuu       최초 생성
 */
public class Subject {

    private final List<Observer> observerVector = new Vector<>();

    protected void notifyObservers() {
        observerVector
                .forEach(Observer::update);
    }
    public void registerObserver(Observer observer) {
        observerVector.add(observer);
    }
}
