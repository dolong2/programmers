def solution(babbling):
    answer = 0
    for world in babbling:
        for w in [ "aya", "ye", "woo", "ma" ]:
            if w * 2 not in world:
                world = world.replace(w, ' ')
        if len(world.strip()) == 0:
            answer += 1
    return answer