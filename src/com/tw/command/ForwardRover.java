package com.tw.command;

import com.tw.robot.Rover;

public class ForwardRover implements ICommand {
    @Override
    public void Run(final Rover rover) {
        rover.forward();
    }
}
