def solution(ingredient):
    answer = 0
    stack = []
    for element in ingredient:
        if len(stack) >= 3 and element == 1 and stack[len(stack)-1] == 3 and stack[len(stack)-2] == 2 and stack[len(stack)-3] == 1:
            stack.pop()
            stack.pop()
            stack.pop()
            answer+=1
            continue
        stack.append(element)
    return answer