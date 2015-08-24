package model

/**
 * Created by FScoward on 15/08/23.
 */
case class ArtistId(val value: Long) extends Identifier[Long]
case class Artist (artistId: ArtistId, name: String)
