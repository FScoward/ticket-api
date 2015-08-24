package model.ticket

/**
 * Created by FScoward on 15/08/22.
 */
abstract sealed class Prefecture(val label: String)
object Prefecture {
  case object Hokkaido extends Prefecture("北海道")
  case object Aomori extends Prefecture("青森")
  
  case object Tokyo extends Prefecture("東京")

  case object Okinawa extends Prefecture("沖縄")
}


