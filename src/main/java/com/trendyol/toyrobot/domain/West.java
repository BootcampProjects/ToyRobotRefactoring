package com.trendyol.toyrobot.domain;

public class West implements Direction {
    @Override
    public void move(Position position) {
        position.moveWest();
    }

    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }

    @Override
    public Compass getCompass() {
        return Compass.WEST;
    }
}
