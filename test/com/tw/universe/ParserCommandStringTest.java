package com.tw.universe;

import com.tw.command.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParserCommandStringTest {

    @Test
    void convertCommandsString() {
        String stringCommands = "LRM";
        List<ICommand> expected = new ArrayList<ICommand>();
        {
            expected.add(new LeftSpinRover());
        }
        ;
        List<ICommand> commands = ParserCommandString.parse(stringCommands);
        assertTrue(commands.get(0) instanceof LeftSpinRover);
        assertTrue(commands.get(1) instanceof RightSpinRover);
        assertTrue(commands.get(2) instanceof ForwardRover);
        assertEquals(3, commands.size());
    }
}
