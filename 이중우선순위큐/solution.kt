class Solution {
    fun solution(operations: Array<String>): IntArray {
        val list = mutableListOf<Int>()
        operations.forEach {
            when {
                it.contains("I") -> list.add(it.split(' ')[1].toInt())
                it == "D 1" -> list.removeLastOrNull()
                it == "D -1" -> list.removeFirstOrNull()
            }
            list.sort()
        }
        return if (list.isNotEmpty())
                    intArrayOf(list.removeLast(), list.removeFirst())
                else intArrayOf(0, 0)
    }
}