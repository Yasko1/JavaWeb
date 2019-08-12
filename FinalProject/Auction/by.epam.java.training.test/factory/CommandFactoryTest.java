package factory;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import service.command.Command;
import service.command.LoginCommand;
import service.command.ProfileCommand;
import service.factory.CommandFactory;

public class CommandFactoryTest {

    private static final String LOGIN = "login";
    private static final String PROFILE = "profile";

    @Test
    public void shouldCreateAndReturnLoginCommand() {
        Command command = CommandFactory.create(LOGIN);

        Class<? extends Command> commandClass = command.getClass();
        assertEquals(LoginCommand.class, commandClass);
    }

    @Test
    public void shouldCreateAndReturnProfileCommand() {
        Command command = CommandFactory.create(PROFILE);

        Class<? extends Command> commandClass = command.getClass();
        assertEquals(ProfileCommand.class, commandClass);
    }
}