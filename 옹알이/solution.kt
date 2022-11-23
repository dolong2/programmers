class Solution {
    val arr = arrayOf("aya", "ye", "woo", "ma")
    fun solution(babbling: Array<String>): Int =
        babbling.filter {
            var str = it
            arr.map {
                if (!str.contains(it + it))
                    str = str.replace(it, " ")
            }
            str.strip().isEmpty()
        }.size
}