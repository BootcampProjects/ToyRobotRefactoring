package com.trendyol.toyrobot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Position {
    private int x;
    private int y;

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public void moveEast() {
        this.x++;
    }

    public void moveWest() {
        this.x--;
    }

    public void moveNorth() {
        this.y++;
    }

    public void moveSouth() {
        this.y--;
    }
}
