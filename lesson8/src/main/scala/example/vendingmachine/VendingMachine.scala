package example.vendingmachine

class VendingMachine {

    var chocolateBar = 0
    var granolaBar = 0

    var totalMoney = 0.0

    def buy(product: String, money: Double): String = {
        if (!isProductAvailabe(product)) {
            s"Sorry, product $product not available"
        } else if (!isMoneyEnough(product, money)) {
            "Please, insert more money"
        } else {
            completeRequest(product, money)
        }
    }

    def isProductAvailabe(product: String): Boolean = ???

    def isMoneyEnough(product: String, money: Double): Boolean = ???

    def completeRequest(product: String, money: Double): String = ???
}