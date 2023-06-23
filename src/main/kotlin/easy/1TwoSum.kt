package easy

fun twoSum(nums: IntArray, target: Int) : IntArray {
    val array = IntArray(2)
    for (i in 0 until nums.size - 1) {
        for (j in i+1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return array
}