package ru.netology

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
fun main() {
    val price = 15_000
    val discount = 0
    val discountSmall = 100
    val discountLargeRate = 0.05
    val isRegularCustomer = true
    val result: Double = when {
        price <= 1_000 -> price.toDouble()
        price <= 10_000 -> (price - 100).toDouble()
        else -> price * 0.95
    }

    val finalPrice = if (isRegularCustomer) {
        result * 0.99
    } else {
        result
    }

    println("$finalPrice руб.")
}
