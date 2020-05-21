/**
 *
 * Author: fullarray
 * Description: adapted
 *
 */


package app2

abstract class abstractBakeryGood(val flavour: String) {
	fun eat(): String{
		return "nom, nom, nom, nom,... delicious $flavour ${name()}"
	}
	
	/**fun name(): String{
		return "bakery goods"
	}*/
	
	abstract fun name(): String
}

class Customer(val name: String){
	fun eats(food: abstractBakeryGood){
		println("$name is eating... ${food.eat()} on that bench")
	}
}

open class Donut(flavour: String, val topping: String): abstractBakeryGood(flavour){
	override fun name(): String{
		return "donut with $topping topping"
	}
}


fun main(args: Array<String>){
	val myDonut = Donut("Custard", "Powdered sugar")
	val mario = Customer("Mario")
	mario.eats(myDonut)
}
