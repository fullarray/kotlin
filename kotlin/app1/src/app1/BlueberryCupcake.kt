/**

   author: herrj1

*/



package app1

class BlueberryCupcake {
	var flavour = "Blueberry"
}

//fun main(args: Array<String>){
//	val myCupcake = BlueberryCupcake()
//	println("My cupcake has ${myCupcake.flavour}")
//}

/**fun main(args: Array<String>){
	val myCupcake = BlueberryCupcake()
	myCupcake.flavour = "Almond"
	println("My cupcake has ${myCupcake.flavour}")
}*/
//the above throws an error

class AlmondCupcake{
	val flavour = "Almond"
}

/**class Cupcake(val flavour: String){
	fun eat(): String{
		return "nom, nom, nom... delicious $flavour cupcake"
	}
}
*/
fun main(args: Array<String>){
	val myBlueberryCupcake = Cupcake("Blueberry")
	println(myBlueberryCupcake.eat())
}
