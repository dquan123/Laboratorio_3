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