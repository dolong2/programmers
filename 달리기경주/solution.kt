class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val indexMap = players.withIndex().associate { it.value to it.index }.toMutableMap()
        callings.forEach { calling ->
            val index = indexMap[calling]!!
            players[index] = players[index - 1].also { players[index - 1] = players[index] }
            indexMap[calling] = index - 1
            indexMap[players[index]] = index
        }
        return players
    }
}