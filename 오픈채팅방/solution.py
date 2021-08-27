def solution(record):
    answer =  []
    user={}
    for i in range(len(record)):
        act=record[i].split(' ')
        if(act[0]!="Leave"):
            user[act[1]]=act[2]
    for i in range(len(record)):
        act=record[i].split(' ')
        if act[0]=="Enter":
            answer.append(user[act[1]]+"님이 들어왔습니다.")
        elif act[0]=="Leave":
            answer.append(user[act[1]]+"님이 나갔습니다.")
    return answer