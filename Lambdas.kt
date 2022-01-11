fun startsWithC(s: String): Boolean = s.startsWith('c')

fun main() {
  val foo: (String, Int) -> String
  val intVal: Int
  val pets = listOf("cat", "dog", "cow", "canary", "fish")
  /* val cPets = pets.filter({ pet -> pet.startsWith('c') }) */
  val cPets = pets.filter(::startsWithC)
  println(cPets)
}
