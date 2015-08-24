package model.event

import model.Identifier

/**
 * Created by FScoward on 15/08/23.
 */
case class GroupId(val value: Long) extends Identifier[Long]
case class Group(groupId: GroupId, `private`: Boolean = false)
