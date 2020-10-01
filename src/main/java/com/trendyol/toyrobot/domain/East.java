package com.trendyol.toyrobot.domain;

public class East implements Direction {
    @Override
    public void move(Position position) {
        position.moveEast();
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public Compass getCompass() {
        return Compass.EAST;
    }
}
