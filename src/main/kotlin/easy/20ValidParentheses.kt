package easy

fun isValid(s: String): Boolean {
    val open = listOf('(','[','{')
    val close = listOf(')',']','}')
    val a = mutableListOf<Char>()

    if (s.length % 2 != 0) {
        return false
    }

    s.forEach {

        if (a.isEmpty() && close.contains(it)) {
            return false
        }

        if (close.contains(it) && a.last() == open[close.indexOf(it)]) {
            a.removeAt(a.size - 1)
        } else {
            a.add(it)
        }
    }

    return a.isEmpty()
}