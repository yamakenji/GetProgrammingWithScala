package example

class HotBeverage(name: String) extends Beverage(name) {
    override def requst(): String = s"Reheat a $name"
}