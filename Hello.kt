fun printGreeting(who: String, greeting: String = "Hello"): Unit {
  println("$greeting, $who")
}

fun powerOf(base: Int, exponent: Int): Int {
  var result = 1
  for(i in exponent downTo 1) result *= base
  return result
}

fun timesTwo(x: Int) = x * 2

fun main() {
  /* println("Hello, world!")

  /* int a */
  var a: Int = 32
  var b = 16

  /* b = 4.25 */

  var x: Double
  x = 4.toDouble()

  a = b
  b *= 4
  x = 3.1415

  val n = 128
  /* n = 64 */

  var nonNull: String = "This is not nullable"
  /* nonNull = null */
  println(nonNull.length)

  var nullable: String? = "This is a nullable variable"
  /* nullable = null */
  println(nullable?.length)
  /* a?.b?.c?.d?.e */
  println(nullable?.length ?: 0)


  val numDonuts = 16
  val donutStr = "I have $numDonuts donuts"
  println(donutStr)

  var numPickles = 32
  val foodStr = "I have ${numDonuts + numPickles} food items"
  println(foodStr)

  println(donutStr + " and $numPickles pickles")

  var aStr = "a is $a"
  a = 128
  println("${aStr.replace("is", "was")} but now it's $a \$")

  if (numDonuts >= 12) {
    println("Plenty of donuts")
  } else {
    println("Better get more donuts")
  }

  val max = if (a > b) a else b

  if (numDonuts !in 2..24) {

  }

  when (numDonuts) {
    0, 1 -> {
      println("Low on donuts")
      println("Another line")
    }
    in 2..24 -> println("Plenty of donuts")
    else -> println("🤑")
  }

  val donuts = listOf("glazed", "sugar", "buttermilk bar")
  /* donuts.add("cruller") */
  println(donuts)

  val mutableDonuts = mutableListOf("glazed", "sugar", "buttermilk bar")
  mutableDonuts.add("cruller")
  println(mutableDonuts)
  /* mutableDonuts = mutableListOf() */

  var donutArr = arrayOf("glazed", "sugar", "buttermilk bar")
  /* var donutArr = String[3] */

  val numbers: IntArray = intArrayOf(1, 2, 3)

  var squares = IntArray(10) { it * it }
  println(java.util.Arrays.toString(squares))

  for ((i, donut) in donuts.withIndex()) {
    println("donuts[$i]: $donut")
  }

  for (i in 1..10) print(i)
  for (i in 10 downTo 1) print(i)
  for (i in 1..10 step 2) print(i)
  for (c in 'a'..'g') print(c) */

  printGreeting("CS 492")
  printGreeting("CS 492", "Greetings")
  printGreeting(who = "world", greeting = "Greetings")
  printGreeting(greeting = "Greetings", who = "world")

  println(powerOf(2, 8))

  println(timesTwo(8))
}
