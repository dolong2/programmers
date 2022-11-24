def solution(n, lost, reserve):
    arr = [1] * (n+2)
    for i in lost:
        arr[i] -= 1
    for i in reserve:
        arr[i] += 1
    for i in range(1,n+1):
        if arr[i] > 1:
            if arr[i-1] == 0:
                arr[i-1]+=1
                arr[i]-=1
            elif arr[i+1] == 0:
                arr[i+1]+=1
                arr[i]-=1
    answer = -2 #배열크기를 2만큼 크게 했으니까
    for i in arr:
        if i>= 1:
            answer+=1
    return answer