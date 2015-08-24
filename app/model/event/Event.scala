package model.event

import model.Identifier
import model.ticket.YearMonthDate

/**
 * Created by FScoward on 15/08/22.
 */
case class EventId(val value: Long) extends Identifier[Long]
case class Event(eventId: EventId, title: String, eventDate: YearMonthDate, startTime: String)
