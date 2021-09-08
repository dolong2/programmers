function solution(lottos, win_nums) {
    var answer = [];
    var cnt=0;
    var zero_cnt=0;
    var check=(i)=>{
        if(i==6)return 1;
        else if(i==5)return 2;
        else if(i==4)return 3;
        else if(i==3)return 4;
        else if(i==2)return 5;
        else return 6;
    }
    for(let i of lottos){
        if(i==0){
            zero_cnt++;
            continue;
        }
        for(let j of win_nums){
            if(i==j){
                cnt++;
            }
        }
    }
    answer.push(check(cnt+zero_cnt));
    answer.push(check(cnt));
    return answer;
}