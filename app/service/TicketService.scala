package service

/**
 * Created by FScoward on 15/08/22.
 */
object TicketService extends TicketService 
trait TicketService {
  def ticketList: String = {
    "Ticket"
  }
}
