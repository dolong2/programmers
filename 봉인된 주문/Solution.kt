import kotlin.math.pow

class Solution {
    fun solution(n: Long, bans: Array<String>): String {
        // 문자열 → 사전 index 변환
        fun stringToIndex(s: String): Long {
            var index = 0L
            for (l in 1 until s.length) {
                index += 26.0.pow(l).toLong()
            }
            var offset = 0L
            for (i in s.indices) {
                val pos = s[i] - 'a'
                offset = offset * 26 + pos
            }
            return index + offset + 1
        }

        // index → 문자열 변환
        fun indexToString(idx: Long): String {
            var length = 1
            var base = 0L
            var count = 26.0.pow(length).toLong()
            while (idx > base + count) {
                base += count
                length++
                count = 26.0.pow(length).toLong()
            }
            var offset = idx - base - 1
            val chars = CharArray(length)
            for (i in length - 1 downTo 0) {
                chars[i] = ('a'.code + (offset % 26).toInt()).toChar()
                offset /= 26
            }
            return String(chars)
        }

        // 제거 문자열을 index로 변환 후 정렬
        val removedIdx = bans.map { stringToIndex(it) }.sorted()

        // upper bound (mid 이하 개수 구하기)
        fun removedCount(mid: Long): Int {
            var lo = 0
            var hi = removedIdx.size
            while (lo < hi) {
                val m = (lo + hi) / 2
                if (removedIdx[m] <= mid) lo = m + 1
                else hi = m
            }
            return lo
        }

        fun validCount(mid: Long): Long = mid - removedCount(mid)

        // 이진 탐색: n번째 유효 문자열 찾기
        var low = 1L
        var high = Long.MAX_VALUE / 2
        while (low < high) {
            val mid = (low + high) / 2
            if (validCount(mid) >= n) high = mid
            else low = mid + 1
        }
        return indexToString(low)
    }
}