package service.command.admin;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Lot;
import entity.LotStatusEnum;
import exception.ServiceException;
import service.LotService;
import service.command.Command;
import service.command.CommandResult;

/**
 * Designed to perform a lot refusing process.
 */
public class RefuseLotCommand implements Command {

    private static final String LOT_ID = "lotId";
    private static final String COMMAND_LOT_MANAGEMENT = "controller?command=lotManagement";

    /**
     * Process the request, refuse lot and generates a result of processing in the form of
     * {@link .command.CommandResult} object.
     *
     * @param request  an {@link HttpServletRequest} object that contains client request
     * @param response an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @return A response in the form of {@link command.CommandResult} object.
     * @throws ServiceException when DaoException is caught.
     */
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String idLotString = request.getParameter(LOT_ID);
        long idLot = Long.valueOf(idLotString);

        LotService lotService = new LotService();
        Optional<Lot> lot = lotService.findById(idLot);

        if (lot.isPresent()) {
            Lot lotItem = lot.get();
            lotItem.setStatus(LotStatusEnum.REFUSED);
            lotService.save(lotItem);
        }


        return new CommandResult(COMMAND_LOT_MANAGEMENT, true);
    }
}
