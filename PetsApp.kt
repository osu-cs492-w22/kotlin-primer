import edu.oregonstate.pets.Cat
import edu.oregonstate.pets.Dog
/* import edu.oregonstate.pets.* */

import kotlin.random.Random

fun main() {
  val c = Cat("Hobbes")
  c.speak()

  val d = Dog("Snoopy")
  d.speak()

  val x = Random.nextInt(0, 100)
}
