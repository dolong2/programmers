function solution(price, money, count) {
    var answer = -1,total=0;
    for(var i=0;i<count;i++){
        total+=price*(i+1);
    }
    answer=total>money?total-money:0;
    return answer;
}