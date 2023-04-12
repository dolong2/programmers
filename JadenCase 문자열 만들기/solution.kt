class Solution {
    fun solution(s: String): String =
        s.lowercase().split(" ").joinToString(" ") {
            if (it.isNotEmpty())
                "${it[0].uppercase()}${it.substring(1)}"
            else
                it
        }
}
