package com.tw.command;

import com.tw.robot.Rover;

public class RightSpinRover implements ICommand {
    @Override
    public void Run(final Rover rover) {
        rover.spinRight();
    }
}
