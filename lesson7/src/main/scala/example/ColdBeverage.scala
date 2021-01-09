package example

class ColdBeverage(name: String) extends Beverage(name) {
    override def requst(): String = s"Add more ice to $name"
}