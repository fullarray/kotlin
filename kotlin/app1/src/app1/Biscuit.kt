/**

   author: fullarray

*/



package app1

/**
class Biscuit(val flavour: String) {
	fun eat(): String{
		return "nom, nom, nom... delicious $flavour biscuit"
	}
}

class Cupcake(val flavour: String){
	fun eat(): String{
		return "nom, nom, nom... delicious $flavour cupcake"
	}
}
*/
open class BakeryGood(val flavour: String){
	fun eat(): String{
		return "nom, nom, nom... delicious $flavour ${name()}"
	}
	
	open fun name(): String{
		return "Bakery good"
	}
}


open class Roll(flavour: String): BakeryGood(flavour){
	override fun name(): String{
		return "roll"
	}
}


class CinnamonRoll: Roll("Cinnamon")



/**open class Donut(flavour: String, val topping: String): BakeryGood(flavour){
	override fun name(): String{
		return "donut with $topping topping"
	}
}*/




class Cupcake(flavour: String): BakeryGood(flavour){
	override fun name(): String{
		return "Cupcake"
	}
}

class Biscuit(flavour: String): BakeryGood(flavour){
	override fun name(): String{
		return "Biscuit"
	}
}

fun main(args: Array<String>){
	val myBlueberryCupcake: BakeryGood = Cupcake("Blueberry")
	val myDonut = Donut("Custard", "Powdered sugar")
	println(myBlueberryCupcake.eat())
	println(myDonut.eat())
}


