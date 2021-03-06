package coop.rchain.rosette

case class TblObject(meta: Ob, parent: Ob, entry: Seq[Ob], override val slot: Seq[Ob]) extends Ob

object TblObject {

  val PLACEHOLDER = TblObject(Nil)

  def apply(entry: Seq[Ob], slot: Seq[Ob] = Seq()): TblObject =
    TblObject(meta = null, parent = null, entry, slot)
}
