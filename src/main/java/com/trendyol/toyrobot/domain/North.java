package com.trendyol.toyrobot.domain;

public class North implements Direction {
    @Override
    public void move(Position position) {
        position.moveNorth();
    }

    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public Compass getCompass() {
        return Compass.NORTH;
    }
}
