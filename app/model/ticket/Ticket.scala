package model.ticket

import model.Identifier
import play.api.db.DB
import slick.driver.MySQLDriver.api._
import play.api.Play.current

/**
 * Created by FScoward on 15/08/22.
 */

case class TicketId(val value: Long) extends Identifier[Long]
case class Ticket (id: TicketId, num: Int = 0)

object TicketTable {
  val database = Database.forDataSource(DB.getDataSource())

  implicit val ticketIdMapper = MappedColumnType.base[TicketId, Long](_.value, TicketId)
  
  class Tickets(tag: Tag) extends Table[Ticket](tag, "Ticket") {
    def ticketId = column[TicketId]("TICKET_ID", O PrimaryKey)
    def num = column[Int]("NUM")
   
    def * = (ticketId, num) <> (Ticket.tupled, Ticket.unapply)
  }
  
  val ticketQuery = TableQuery[Tickets]
  
  def findById(id: TicketId) = {
    ticketQuery.filter(_.ticketId === id)
    
  }
}
