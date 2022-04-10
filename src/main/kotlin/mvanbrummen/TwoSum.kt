// https://leetcode.com/problems/two-sum/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i == j) continue
                if (nums[i] + nums[j] == target) {
                    return listOf(i, j).toIntArray()
                }
            }
        }
        return emptyList<Int>().toIntArray()
    }
}