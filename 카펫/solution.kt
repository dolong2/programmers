class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val sum = brown + yellow
        val answer = intArrayOf(0,0)
        for(i in sum/2 downTo  2){
            if(sum % i == 0 && ((i-2) * (sum / i - 2)) == yellow) {
                answer[0] = i
                answer[1] = sum / i
                break
            }
        }
        return answer
    }
}