def solution(price, money, count):
    answer = 0
    total=0
    for i in range(count):
        total=total+(price*(i+1))
    if total>money:
        answer=total-money
    return answer