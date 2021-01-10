package example

import example.vendingmachine._

object Main extends App {

    val machine = new VendingMachine
 
    machine.chocolateBar += 2
    machine.granolaBar += 1
    println(machine.buy("chocolate", 1))
    println(machine.buy("granola", 2))
    println(machine.totalMoney)

}