fun max(first: Int, second: Int) = if (first > second) first else second

fun max(first: Int, second: Int, third: Int) = if (max(first, second) > third) max(first, second) else third

fun main() {
    val age = 18
    val last = "Ivanov"
    val name = "Ivan"
    val size = 65

    println("Age : $age, last : $last, name : $name, size : $size")
    println("result : ${add(1, 2)}")
    println("result : ${subtract(1, 2)}")
    println("result : ${multiple(1, 2)}")
    println("result : ${divide(1, 2)}")
    println("max from 1 and 2 is ${max(1, 2)}")
    println("max from 1 and 2 and 3 is ${max(1, 3, 2)}")
}