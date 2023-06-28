package easy

fun longestCommonPrefix(strs: Array<String>): String {
    var sequence: String = ""
    for (i in 0..200) {
        if (strs.all { it.length > i }) {
            if (strs.all { it[i] == strs.first()[i] }) {
                sequence += strs.first()[i]
            } else {
                break
            }
        } else {
            break
        }
    }
    return sequence
}