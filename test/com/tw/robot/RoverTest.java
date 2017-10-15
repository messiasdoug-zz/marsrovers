package com.tw.robot;

import com.tw.universe.Coordinate;
import com.tw.universe.Direction;
import com.tw.universe.Plateau;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    private Plateau plateau;

    @BeforeEach
    void setUp() {
        plateau = new Plateau(5, 5);
    }

    @Test
    void getCurrentPosition12N() {
        Coordinate currentPosition = new Coordinate(1, 2);
        Rover rover = new Rover(plateau, currentPosition, Direction.N);
        assertEquals("1 2 N", rover.getCurrentPosition());
    }

    @Test
    void runCommandLMLMLMLMM() {
        Coordinate currentPosition = new Coordinate(1, 2);
        Rover rover = new Rover(plateau, currentPosition, Direction.N);
        rover.execute("LMLMLMLMM");
        assertEquals("1 3 N", rover.getCurrentPosition());
    }

    @Test
    void getCurrentPosition33E() {
        Coordinate currentPosition = new Coordinate(3, 3);
        Rover rover = new Rover(plateau, currentPosition, Direction.E);
        assertEquals("3 3 E", rover.getCurrentPosition());
    }

    @Test
    void runCommandMMRMMRMRRM() {
        Coordinate currentPosition = new Coordinate(3, 3);
        Rover rover = new Rover(plateau, currentPosition, Direction.E);
        rover.execute("MMRMMRMRRM");
        assertEquals("5 1 E", rover.getCurrentPosition());
    }
}