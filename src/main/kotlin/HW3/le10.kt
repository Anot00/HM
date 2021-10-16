package HW3

fun main() {
    val itemCosts = mapOf("Хлеб" to 50.0, "Молоко" to 100.0,"Рис" to 30.0)
    val shoppingList = listOf("Хлеб", "Молоко","Рис")

    var totalCost = 0.0
    for (items in shoppingList) {
        val itemCost = itemCosts[items]
        if (itemCost != null) {
            totalCost += itemCost
        }
    }
    println(totalCost)
}