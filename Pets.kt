package edu.oregonstate.pets

interface Pet {
  var name: String
  val foodType: String
  fun speak()
}

class Cat(override var name: String) : Pet {
  override val foodType = "fish"
  override fun speak() = println("${this.name} says meow")
}

class Dog(override var name: String) : Pet {
  override val foodType = "kibble"
  override fun speak() = println("${this.name} says woof")
}

fun feedPet(p: Pet) {
  println("Feeding ${p.name} some ${p.foodType}")
  p.speak()
}

fun main() {
  val catList = ArrayList<Cat>()
  val strList = ArrayList<String>()
}
