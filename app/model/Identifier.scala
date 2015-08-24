package model

/**
 * Created by FScoward on 15/08/22.
 */
// http://qiita.com/saka1_p/items/b25aea0f17a42228534e
trait Identifier[A] {
  def value: A
  override def equals(obj: Any): Boolean = obj match {
    case other: Identifier[_] => this.value == other.value
    case _ => false
  }
  override def hashCode: Int = value.hashCode
}
