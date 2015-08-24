package controllers.ticket

import authentication.AuthenticateAuthAction
import model.ticket.{TicketId, Ticket}
import play.api.mvc.Controller
import service.TicketService
import play.api.libs.json._

/**
 * Created by FScoward on 15/08/22.
 */
class TicketController extends TicketControllerBase {
  val ticketService = TicketService
}
trait TicketControllerBase extends Controller {
  val ticketService: TicketService
  
//  implicit val ticketReads: Reads[Ticket] = (
//    (__ \ "ticketId").read[TicketId] and
//    (__ \ "title").read[String]
//    )(Ticket)
  
  def getTickets = AuthenticateAuthAction {
    
    Ok(ticketService.ticketList)
  }
}
