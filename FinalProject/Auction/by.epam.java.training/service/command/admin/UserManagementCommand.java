package service.command.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import exception.ServiceException;
import service.UserService;
import service.command.Command;
import service.command.CommandResult;

/**
 * Designed to perform preparing and submitting the user management page.
 */
public class UserManagementCommand implements Command {

    private static final String USER_LIST = "userList";
    private static final String USER_MANAGEMENT_PAGE = "/WEB-INF/userManagement.jsp";

    /**
     * Process the request and generates a result of processing in the form of
     * {@link com.epam.auction.command.CommandResult} object with user management page.
     *
     * @param request  an {@link HttpServletRequest} object that contains client request
     * @param response an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @return A response in the form of {@link com.epam.auction.command.CommandResult} object.
     * @throws ServiceException when DaoException is caught.
     */
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {

        UserService userService = new UserService();
        List<User> userList = userService.findAllUsers();
        request.setAttribute(USER_LIST, userList);

        return new CommandResult(USER_MANAGEMENT_PAGE, false);
    }
}
