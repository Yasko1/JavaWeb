package service.command;

import exception.ServiceException;
import entity.LotDto;
import service.LotDtoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Designed to prepare main page.
 */
public class MainCommand implements Command {

    private static final String LOT_DTO_LIST = "lotDtoList";
    private static final String MAIN_PAGE = "/WEB-INF/main.jsp";

    /**
     * Process the request, prepare main page and generates a result of processing in the form of
     * {@link command.CommandResult} object.
     *
     * @param request  an {@link HttpServletRequest} object that contains client request
     * @param response an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @return A response in the form of {@link command.CommandResult} object.
     * @throws ServiceException when DaoException is caught.
     */
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {

    	System.out.println("Start");
        LotDtoService lotDtoService = new LotDtoService();
        List<LotDto> lotDtoList = lotDtoService.findAllActive();
        for(LotDto l : lotDtoList) {
        	System.out.println(" ??? " + l.getLot() + " ??? " + l.getPicture() );
        }
        request.setAttribute(LOT_DTO_LIST, lotDtoList);

       System.out.println("Finish");
        return new CommandResult(MAIN_PAGE, false);

    }
}
