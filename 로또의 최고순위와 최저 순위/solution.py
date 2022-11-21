def solution(lottos, win_nums):
    cnt = 0
    zero = 0
    for i in lottos:
      if i in win_nums:
        cnt+=1
      elif i == 0:
        zero+=1
    max = 7 - (cnt + zero)
    min = 7 - cnt
    if(max == 7):
      max = 6
    if(min == 7):
      min = 6
    answer = [max, min]
    return answer