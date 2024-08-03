package easy

fun mySqrt(x: Int): Int {

    if (x == 0 || x == 1) return x
    var start = 1L
    var end = x.toLong()
    var mid = x / 2L

    while (start <= end) {
        val value: Long = mid * mid
        if (value == x.toLong()) return mid.toInt()

        if (value > x.toLong()) {
            end = mid - 1
            mid = end - ((end - start) / 2)
        } else {
            start = mid + 1
            mid = end - ((end - start) / 2)
        }
    }

    return mid.toInt()
}

fun main() {
    println(mySqrt(4))
}