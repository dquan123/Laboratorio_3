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

//Subclase burger
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
class IceCream(name: String, price: Double) : Food(name, price){
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