fun max(first: Int, second: Int) = if (first > second) first else second

fun max(first: Int, second: Int, third: Int) = if (max(first, second) > third) max(first, second) else third

fun fitness(ivan: Int, nik: Int): Int {
    var month = 0
    var powerIvan = ivan
    var powerNikolay = nik
    while (powerIvan < powerNikolay) {
        powerIvan *= 3
        powerNikolay *= 2
        month++
    }
    return month
}

fun sum(start: Int, finish: Int): Int {
    var rsl = 0
    for (value in start..finish) {
        rsl += value
    }
    return rsl
}

fun sumUntilFinish(start: Int, finish: Int): Int {
    var rsl = 0
    for (value in start until finish) {
        rsl += value
    }
    return rsl
}

fun sumByStep2(start: Int, finish: Int): Int {
    var rsl = 0
    for (value in start..finish step 2) {
        rsl += value
    }
    return rsl
}

fun sumDownTo(start: Int, finish: Int): Int {
    var rsl = 0
    for (value in finish downTo start step 2) {
        rsl += value
    }
    return rsl
}

fun draw(size: Int) {
    if (size > 0 && size % 2 != 0) {
        for (value in 0..size step 2) {
            print("X")
        }
    }
}

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
    println("Month : ${fitness(50, 90)}")
    println("Sum : ${sum(1, 5)}")
    println("Sum : ${sumUntilFinish(1, 5)}")
    println("Sum : ${sumByStep2(1, 5)}")
    println("Sum : ${sumDownTo(1, 5)}")
    draw(51)
}