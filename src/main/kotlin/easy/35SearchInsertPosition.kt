package easy

import kotlin.math.min

fun searchInsert(nums: IntArray, target: Int): Int {

    if (nums.isEmpty()) return 0

    if (target > nums.last()) return nums.lastIndex + 1

    var lo = 0
    var hi = nums.lastIndex

    while (lo < hi) {

        val mid = lo + (hi - lo) / 2

        if (target == nums[mid]) return mid

        if (target > nums[mid]) {
            lo = mid + 1
        } else {
            hi = mid
        }
    }

    return lo
}

fun main() {
    val l = intArrayOf(1, 3, 5, 6)
    val target = 4
    println(searchInsert(l, target))
}
