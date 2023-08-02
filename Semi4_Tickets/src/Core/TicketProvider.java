package Core;

import Interfaces.ITicketRepo;
import Models.Ticket;
import Services.TicketRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {
    private ITicketRepo ticketRepo;

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */
    public List<Ticket> getTickets(int routeNumber) throws RuntimeException {
        List<Ticket> routeTickets = new ArrayList<>();
        for (Ticket ticket : ticketRepo.getTickets()) {
            if (ticket.getRouteNumber() == routeNumber && ticket.getValid() == true) {
                routeTickets.add(ticket);
            }
        }
        if (routeTickets.isEmpty()) {
            throw new RuntimeException("There are no tickets for this bus.");
        }
        return routeTickets;
    }

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public boolean updateTicketStatus(Ticket ticket) {
        ticket.setValid(false);
        return true;
    }
}