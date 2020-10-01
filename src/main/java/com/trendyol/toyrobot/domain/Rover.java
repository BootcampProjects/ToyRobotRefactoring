package com.trendyol.toyrobot.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Rover {

    private String id;
    private Position position;
    private Direction direction;
    private List<Material> material;

    public Rover() {
        this.id = UUID.randomUUID().toString();
        this.position = new Position();
        this.direction = new North();
        this.material = new ArrayList<>();
        this.material.add(new Material("Material-NoArg"));
    }

    public Rover(int x, int y, Direction direction) {
        this.id = UUID.randomUUID().toString();
        this.position = new Position(x, y);
        this.direction = direction;
        this.material = new ArrayList<>();
        this.material.add(new Material("Material-withArgs"));
    }

    public void move() {
        this.direction.move(position);
        this.material.add(new Material(this.direction.getCompass().name()));
    }

    public void turnLeft() {
        this.direction = direction.turnLeft();
        this.material.add(new Material(this.direction.getCompass().name()));
    }

    public void turnRight() {
        this.direction = direction.turnRight();
        this.material.add(new Material(this.direction.getCompass().name()));
    }

    public int getX() {
        return this.position.getX();
    }

    public int getY() {
        return this.position.getY();
    }

    public Compass getCompass() {
        return this.direction.getCompass();
    }
}
