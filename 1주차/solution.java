class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total=0;
        for(int i=0;i<count;i++){
            total+=(price*(i+1));
        }
        answer=money>=total?0:total-money;
        return answer;
    }
}