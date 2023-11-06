package easy

fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var position = 0
    for (i in 0..nums.size - 1) {
        if (nums[i] != `val`) {
            nums[position] = nums[i]
            position++
        }
    }
    return position
}