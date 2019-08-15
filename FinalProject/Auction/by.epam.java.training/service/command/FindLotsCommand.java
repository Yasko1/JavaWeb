package service.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Lot;
import entity.LotDto;
import entity.LotStatusEnum;
import exception.ServiceException;
import service.LotDtoService;
import service.util.DateTimeParser;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Designed to performance lot finding process.
 */
public class FindLotsCommand implements Command {

    private static final String MAIN_PAGE = "/WEB-INF/main.jsp";
    private static final String LOT_DTO_LIST = "lotDtoList";

    private static final String YEAR_FROM = "year_of_issue_from";
    private static final String YEAR_TO = "year_of_issue_to";
    private static final String DATE_OF_START_FROM = "date_of_start_from";
    private static final String DATE_OF_END_TO = "date_of_end_to";

    /**
     * Process the request, find lots with given parameters and generates a result of processing in the form of
     * {@link command.CommandResult} object.
     *
     * @param request  an {@link HttpServletRequest} object that contains client request
     * @param response an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @return A response in the form of {@link command.CommandResult} object.
     * @throws ServiceException when DaoException is caught.
     */
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {

        Map<String, String> parameters = findLotsParameters(request);

        LotDtoService lotDtoService = new LotDtoService();
        List<LotDto> lotDtoList = lotDtoService.findByParameters(parameters);

        request.setAttribute(LOT_DTO_LIST, lotDtoList);

        return new CommandResult(MAIN_PAGE, false);
    }

    private Map<String, String> findLotsParameters(HttpServletRequest request) {

        
        String yearFrom = request.getParameter(YEAR_FROM);
        String yearTo = request.getParameter(YEAR_TO);
        String isDamaged = request.getParameter(Lot.IS_DAMAGED);

        Map<String, String> parameters = new HashMap<>();
        parameters.put(YEAR_FROM, yearFrom);
        parameters.put(YEAR_TO, yearTo);
        parameters.put(Lot.IS_DAMAGED, isDamaged);
        parameters.put(Lot.STATUS, LotStatusEnum.CONFIRMED.getValue());

        Date currentDate = new Date();
        String currentDateString = DateTimeParser.parse(currentDate);
        parameters.put(DATE_OF_START_FROM, currentDateString);
        parameters.put(DATE_OF_END_TO, currentDateString);


        return parameters;
    }
}
