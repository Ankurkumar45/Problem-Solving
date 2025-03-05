def lastZeroes(lst):
    s = 0
    for i in lst:
        if i != 0:
            lst[s] = i
            s += 1
    while s < len(lst):
        lst[s] = 0
        s += 1
    print(lst)
    
lst = [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0]
lastZeroes(lst)