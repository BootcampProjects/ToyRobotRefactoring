package com.trendyol.toyrobot.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void should_create_rover() {
        Rover rover = createNorthRover();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals(Compass.NORTH, rover.getCompass());
    }

    @Test
    public void should_move_forward_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.move();
        assertEquals(1, rover.getY());
    }

    @Test
    public void should_move_forward_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.move();
        assertEquals(1, rover.getX());
    }

    @Test
    public void should_move_forward_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.move();
        assertEquals(-1, rover.getY());
    }

    @Test
    public void should_move_forward_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.move();
        assertEquals(-1, rover.getX());
    }

    @Test
    public void should_turn_left_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnLeft();
        assertEquals(Compass.WEST, rover.getCompass());
    }

    @Test
    public void should_turn_left_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnLeft();
        assertEquals(Compass.SOUTH, rover.getCompass());
    }

    @Test
    public void should_turn_left_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnLeft();
        assertEquals(Compass.EAST, rover.getCompass());
    }

    @Test
    public void should_turn_left_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnLeft();
        assertEquals(Compass.NORTH, rover.getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnRight();
        assertEquals(Compass.EAST, rover.getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnRight();
        assertEquals(Compass.SOUTH, rover.getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnRight();
        assertEquals(Compass.WEST, rover.getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnRight();
        assertEquals(Compass.NORTH, rover.getCompass());
    }

    @Test
    public void should_add_materials_when_change_location() {
        Rover rover = createNorthRover();
        rover.turnRight();
        rover.turnRight();
        rover.turnLeft();
        rover.move();

        assertEquals(Compass.EAST, rover.getCompass());
        assertEquals(5, rover.getMaterial().size());
        assertEquals("Material-NoArg", rover.getMaterial().get(0).getName());
        assertEquals("SOUTH", rover.getMaterial().get(2).getName());
        assertEquals("EAST", rover.getMaterial().get(4).getName());
    }

    private Rover createWestRover() {
        return new Rover(0, 0, new West());
    }

    private Rover createSouthRover() {
        return new Rover(0, 0, new South());
    }

    private Rover createEastRover() {
        return new Rover(0, 0, new East());
    }

    private Rover createNorthRover() {
        return new Rover();
    }
}
