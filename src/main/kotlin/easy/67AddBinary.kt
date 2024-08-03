package easy

fun addBinary(a: String, b: String): String {
    var carry = 0
    val result = StringBuilder()

    val maxLength = maxOf(a.length, b.length)

    for (i in 0 until maxLength) {
        val bitA = if (i < a.length) a[a.length - 1 - i] - '0' else 0
        val bitB = if (i < b.length) b[b.length - 1 - i] - '0' else 0
        val sum = bitA + bitB + carry
        result.append(sum % 2)
        carry = sum / 2
    }

    if (carry != 0) {
        result.append(carry)
    }

    return result.reverse().toString()
}

fun main() {
    val a = "110"
    val b = "1"
    println(addBinary(a, b))
}
