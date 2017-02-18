package onlisp.macros

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros

object MacroDefs {
  def fiveMacro: Int = macro MacroImpl.five
  def fiveFunc: Int = 5
}

class MacroImpl(val c: Context) {
  import c.universe._

  def five: Tree = Literal(Constant(5))

}
