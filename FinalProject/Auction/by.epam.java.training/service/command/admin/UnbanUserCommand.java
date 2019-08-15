package service.command.admin;

import service.command.Command;
import service.command.CommandResult;
import exception.ServiceException;
import entity.User;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * Designed to perform the process of unlocking a user.
 */
public class UnbanUserCommand implements Command {

    private static final String USER_ID = "userId";
    private static final String COMMAND_USER_MANAGEMENT = "controller?command=userManagement";

    /**
     * Process the request, unlocks the user and generates a result of processing in the form of
     * {@link command.CommandResult} object.
     *
     * @param request  an {@link HttpServletRequest} object that contains client request
     * @param response an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @return A response in the form of {@link command.CommandResult} object.
     * @throws ServiceException when DaoException is caught.
     */
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {

        String userIdString = request.getParameter(USER_ID);
        long userId = Long.valueOf(userIdString);

        UserService userService = new UserService();
        Optional<User> user = userService.findById(userId);

        if (user.isPresent()) {
            User userItem = user.get();
            userItem.setBanned(false);
            userService.save(userItem);
        }

        return new CommandResult(COMMAND_USER_MANAGEMENT, true);
    }
}
