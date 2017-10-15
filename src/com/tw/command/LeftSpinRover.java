package com.tw.command;

import com.tw.robot.Rover;

public class LeftSpinRover implements ICommand {
    @Override
    public void Run(final Rover rover) {
        rover.spinLeft();
    }
}
