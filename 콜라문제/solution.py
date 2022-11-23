def solution(a, b, n):
    answer = 0
    while (n >= a):
        remainder = n % a
        n = (n//a) * b
        answer += n
        n += remainder
    return answer