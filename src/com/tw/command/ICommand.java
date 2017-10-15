package com.tw.command;

import com.tw.robot.Rover;

public interface ICommand {

    void Run(final Rover rover);
}
