package easy

fun strStr(haystack: String, needle: String): Int {
    if (needle.isBlank()) {
        return -1
    }

    if (haystack.contains(needle).not()) {
        return -1
    }
    var word = ""
    haystack.forEachIndexed { index, c ->
        word += c
        if (word.contains(needle)) {
            return index + 1 - needle.length
        }
    }
    return -1
}
