class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val arr = Array(n+2) { 1 }
        lost.forEach {
            arr[it]--
        }
        reserve.forEach {
            arr[it]++
        }
        for (i in 1..n){
            if(arr[i] > 1){
                if(arr[i-1] == 0){
                    arr[i-1]++
                    arr[i]--
                }
                else if( arr[i+1] == 0){
                    arr[i+1]++
                    arr[i]--
                }
            }
        }
        return arr.filter{ it>=1 }.size-2
    }
}