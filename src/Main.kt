//Clase abstracta de comidas
abstract class Food(val name: String, val price: Double){
    abstract fun cook(): String
}

//Subclase burger
class Burger(name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "La hamburguesa $name se debe asar durante 15 minutos a fuego alto"
    }
}

//Subclase pizza
class Pizza(name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "La pizza $name se hornea hasta que las orillas se vean cafés"
    }
}

//Interfaz Dessert
interface Dessert {
    fun eat(): String
}

//Clase IceCream que hereda de Food y usa Dessert
class IceCream(name: String, price: Double) : Food(name, price), Dessert{
    override fun cook(): String {
        return "El helado $name se enfría durante 1 día para que se cristalice"
    }

    override fun eat(): String {
        return "El helado $name se come despacio mientras se va reduciendo el volumen"
    }
}

//Clase abstracta Drink que hereda de Food
abstract class Drink(name: String, price: Double) : Food(name, price){
    abstract fun pour(): String
}

//Subclase Juice que hereda de Drink
class Juice(name: String, price: Double) : Drink(name, price){

    override fun cook(): String {
        return "Para exprimir el jugo $name se deben seleccionar frutas frescas y usar un extractor"
    }

    override fun pour(): String {
        return "El jugo $name se vierte inclinando el bote donde esté poco a poco"
    }
}

//Extension Function para Food
fun Food.discountedPrice(discountedPercent: Double): Double {
    val discount = price * (discountedPercent / 100)
    return price - discount
}

//Main
fun main(){

    println("SISTEMA DE PEDIDOS")
    println()

    //Creación de las instancias
    val burger = Burger("Carnívora", 50.0)
    val pizza = Pizza("4 quesos", 45.0)
    val iceCream = IceCream("Mora", 12.0)
    val juice = Juice("Naranja", 15.0)

    //Mostrar omo se cocinan los alimentos
    println(burger.cook())
    println(pizza.cook())
    println(iceCream.cook())
    println(juice.cook())

    println()

    //Comer el helado
    println(iceCream.eat())

    println()

    //Vertir el jugo
    println(juice.pour())

    println()

    //Calcular el descuento de la hamburguesa y mostrar el precio final
    val newBurgerPrice = burger.discountedPrice(20.0)
    println("El precio de la hamburguesa luego de aplicar el descuento es de $newBurgerPrice")
}