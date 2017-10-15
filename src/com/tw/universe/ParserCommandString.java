package com.tw.universe;

import com.tw.command.ForwardRover;
import com.tw.command.ICommand;
import com.tw.command.LeftSpinRover;
import com.tw.command.RightSpinRover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParserCommandString {

    private static Map<Character, ICommand> mapCommands = new HashMap<Character, ICommand>() {{
        put('L', new LeftSpinRover());
        put('R', new RightSpinRover());
        put('M', new ForwardRover());
    }};

    public static List<ICommand> parse(String stringCommands) {

        List<ICommand> commands = new ArrayList<ICommand>();

        char[] charCommands = stringCommands.toCharArray();
        for (Character letterCommand: charCommands) {
            ICommand commandMap = mapCommands.get(letterCommand);
            if (commandMap != null)
                commands.add(commandMap);
        }
        
        return commands;
    }
}
