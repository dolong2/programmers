import java.util.Arrays;

public class Solution{

    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (a, b) -> {
            if (a[col - 1] != b[col - 1]) {
                return Integer.compare(a[col - 1], b[col - 1]);
            } else {
                return Integer.compare(b[0], a[0]);
            }
        });

        int xorSum = 0;
        for (int i = row_begin - 1; i < row_end; i++) {
            int s_i = 0;
            for (int val : data[i]) {
                s_i += val % (i + 1);
            }
            xorSum ^= s_i;
        }

        return xorSum;
    }
}
