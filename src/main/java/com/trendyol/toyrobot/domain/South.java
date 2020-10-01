package com.trendyol.toyrobot.domain;

public class South implements Direction {
    @Override
    public void move(Position position) {
        position.moveSouth();
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public Compass getCompass() {
        return Compass.SOUTH;
    }
}