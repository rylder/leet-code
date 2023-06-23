import easy.twoSum

fun main() {
    val nums = intArrayOf(3,2,4)
    val target = 6
    val result = twoSum(nums, target)
    println("[${result[0]}, ${result[1]}]")
}