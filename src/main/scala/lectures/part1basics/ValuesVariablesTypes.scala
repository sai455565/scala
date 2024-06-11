package lectures.part1basics

//The "extend app" is equivalent to creating a
// -- main function which makes application runnable
object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  // values are immutable
  // type of vales are optional
  // compiler can infer types

  val aSting: String = "hello"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x

  println(aInt)

  val aLong: Long = 3734757345L
  val aDouble: Double = 2.15

  // valiabes

  var aVariable: Int = 4
  println(aVariable)


}
