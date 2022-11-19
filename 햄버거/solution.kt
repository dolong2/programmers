import java.util.Stack
class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val burger = Stack<Int>()
        for(element in ingredient){
            if(burger.size >= 3 && element == 1 && burger[burger.size-1] == 3 && burger[burger.size-2] == 2 && burger[burger.size-3] == 1){
                answer++
                burger.pop()
                burger.pop()
                burger.pop()
                continue
            }
            burger.add(element)
        }
        return answer
    }
}