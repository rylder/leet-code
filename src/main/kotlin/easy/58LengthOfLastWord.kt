package easy

fun lengthOfLastWord(s: String): Int {
    val a = s.trim().substringAfterLast(" ")
    return a.length
}

fun main() {
    val s = "   fly me   to   the moon  "
    println(lengthOfLastWord(s))
}
