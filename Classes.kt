class Student(val id: Int, val name: String, var gpa: Double)

class Glass(val full: Double = 0.5)

class Rectangle(var width: Int, var height: Int) {
  /* val area = this.width * this.height */
  val area: Int
    get() = this.width * this.height

  fun print() {
    println("This is a $width x $height rectangle")
  }
}

private class Initter(private val name: String) {
  init {
    println("Initializing Initter with $name")
  }
  val greeting = "Hi, my name is $name"
  init {
    println("Value of greeting: \"$greeting\"")
  }
}

fun main() {
  val s = Student(933111111, "Luke Skywalker", 3.75)
  s.gpa = 3.9
  println("GPA for ${s.name}: ${s.gpa}")

  val s2 = Student(933222222, "Leia Organa", 4.0)
  println("GPA for ${s2.name}: ${s2.gpa}")

  val g = Glass()
  val g2 = Glass(full = 1.0)

  val r = Rectangle(4, 8)
  r.print()
  println("area of r: ${r.area}")
  r.width = 5
  r.print()
  println("area of r: ${r.area}")

  val initter = Initter("initter")
}
