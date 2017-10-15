package com.tw.robot;

import com.tw.command.ICommand;
import com.tw.universe.Coordinate;
import com.tw.universe.Direction;
import com.tw.universe.ParserCommandString;
import com.tw.universe.Plateau;

import javax.swing.text.html.parser.Parser;
import java.util.List;

public class Rover {

    private Plateau plateu;
    private Coordinate currentCoordinate;
    private Direction currentDirection;

    public Rover(Plateau plateu, Coordinate currentCoordinate, Direction direction) {
        this.plateu = plateu;
        this.currentCoordinate = currentCoordinate;
        this.currentDirection = direction;
    }

    public String getCurrentPosition() {
        return this.currentCoordinate.toString() + " " + this.currentDirection.toString();
    }

    public void execute(String stringCommands) {
        List<ICommand> commands = ParserCommandString.parse(stringCommands);
        for (ICommand command : commands) {
            command.Run(this);
        }
    }

    public void spinLeft() {
        this.currentDirection = this.currentDirection.left();
    }

    public void spinRight() {
        this.currentDirection = this.currentDirection.right();
    }

    public void forward() {
        this.currentCoordinate = this.currentCoordinate.newCoordinate(this.currentDirection.getAxisX(), this.currentDirection.getAxisY());
    }
}
