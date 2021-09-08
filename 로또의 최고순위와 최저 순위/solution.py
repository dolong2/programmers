def check(i):
    if i==6:
        return 1
    elif i==5:
        return 2
    elif i==4:
        return 3
    elif i==3:
        return 4
    elif i==2:
        return 5
    else:
        return 6
def solution(lottos, win_nums):
    answer = []
    cnt=0
    zero_cnt=0;
    for i in lottos:
        if i==0:
            zero_cnt+=1
        for j in win_nums:
            if i==j:
                cnt+=1
    answer.append(check(cnt+zero_cnt));
    answer.append(check(cnt));
    return answer