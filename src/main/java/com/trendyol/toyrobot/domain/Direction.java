package com.trendyol.toyrobot.domain;

public interface Direction {
    void move(Position position);
    Direction turnLeft();
    Direction turnRight();
    Compass getCompass();
}
