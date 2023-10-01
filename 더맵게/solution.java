import java.util.*;

public class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }
        int answer = 0;

        while (pq.size() > 1) {
            if (pq.peek() >= K) {
                return answer;
            }
            int first = pq.poll();
            int second = pq.poll();
            int mixed = first + (second * 2);
            pq.add(mixed);
            answer++;
        }

        return pq.peek() >= K ? answer : -1;
    }
}
