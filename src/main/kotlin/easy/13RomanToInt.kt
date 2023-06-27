package easy

fun romanToInt(s: String): Int {
    var sum = 0
    var before: Char? = null
    val m = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000,
    )
    for (char in s) {
        sum += if (char != before && before != null && m.getValue(char) > m.getValue(before)) {
            m.getValue(char) - m.getValue(before)*2
        } else {
            m.getValue(char)
        }
        before = char
    }
    return sum
}