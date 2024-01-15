import java.util.PriorityQueue

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var time = 0
        var answer = 0

        val timeQue = PriorityQueue<IntArray>{ o1, o2 -> o1[0] - o2[0] }
        val workQue = PriorityQueue<IntArray>{ o1, o2 -> o1[1] - o2[1] }

        jobs.forEach { arrivalQueue.offer(it) }

        while (workQue.isNotEmpty() || timeQue.isNotEmpty()) {

            while (timeQue.isNotEmpty() && timeQue.peek()[0] <= time) {
                workQue.offer(timeQue.poll())
            }

            if (workQue.isEmpty()) {
                time = timeQue.peek()[0]
            } else {
                val work = workQue.poll()
                answer += time - work[0] + work[1]
                time += work[1]
            }
        }

        return answer / jobs.size
    }
}