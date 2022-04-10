package mvanbrummen

import Solution
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun `solution should return correct answer`() {
        val solution = Solution()

        val result = solution.twoSum(listOf(2, 7, 11, 15).toIntArray(), 9)

        assertThat(result).containsExactly(0, 1)
    }

    @Test
    fun `solution should return correct answer 2`() {
        val solution = Solution()

        val result = solution.twoSum(listOf(3, 2, 4).toIntArray(), 6)

        assertThat(result).containsExactly(1, 2)
    }

    @Test
    fun `solution should return correct answer 3`() {
        val solution = Solution()

        val result = solution.twoSum(listOf(3, 3).toIntArray(), 6)

        assertThat(result).containsExactly(0, 1)
    }
}