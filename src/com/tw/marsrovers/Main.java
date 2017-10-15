package com.tw.marsrovers;

import com.tw.robot.Rover;
import com.tw.universe.Coordinate;
import com.tw.universe.Direction;
import com.tw.universe.Plateau;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Plateau plateau = new Plateau(5, 5);

        Coordinate currentPosition1 = new Coordinate(1, 2);
        Rover rover1 = new Rover(plateau, currentPosition1, Direction.N);
        rover1.execute("LMLMLMLMM");
        System.out.println(rover1.getCurrentPosition());

        Coordinate currentPosition2 = new Coordinate(3, 3);
        Rover rover2 = new Rover(plateau, currentPosition2, Direction.E);
        rover2.execute("MMRMMRMRRM");
        System.out.println(rover2.getCurrentPosition());
    }
}
