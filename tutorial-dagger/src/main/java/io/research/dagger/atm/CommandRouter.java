package io.research.dagger.atm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static io.research.dagger.atm.Command.Status;

public class CommandRouter {
    private final Map<String, Command> commands = Collections.emptyMap();

    public Status route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        Status status = command.handleInput(splitInput.subList(1, splitInput.size()));
        if (status == Status.INVALID) {
            System.out.println(commandKey + ": invalid arguments");
        }

        return status;
    }

    private Status invalidCommand(String input) {
        System.out.println(
            String.format("couldn't understand \"%s\". please try again.", input));
        return Status.INVALID;
    }

    private static List<String> split(String input) {
        return Arrays.asList(input.trim().split("\\s+"));
    }
}
