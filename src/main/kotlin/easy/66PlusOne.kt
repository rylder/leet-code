package easy

import kotlin.math.pow

fun plusOne(digits: IntArray): IntArray {

    var i = digits.size - 1
    while (digits[i] == 9 && i != 0) {
        digits[i] = 0
        i--
    }

    if (digits[i] == 9) {
        val new = IntArray(digits.size + 1)
        new[0] = 1
        return new
    } else {
        digits[i] = digits[i] + 1
    }

    return digits
}

fun main() {
    val a = intArrayOf(9)
    val r = plusOne(a)
    println(r)
}