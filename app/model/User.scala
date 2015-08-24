package model

/**
 * Created by FScoward on 15/08/23.
 */
case class UserId(val value: Long) extends Identifier[Long]
case class User(userId: UserId, name: String)
