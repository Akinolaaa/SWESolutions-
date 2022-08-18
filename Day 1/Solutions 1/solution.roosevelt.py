def series(n):
    if n == 1:
        return "{:.2f}".format(1.00)
    elif n > 1:
        sum = 4
        num = []
        for x in range(1,n-1):
            sum += 3
            num.append(sum)
        add = 0
        for x in num:
            add += 1/x
        result = "{:.2f}".format(1 + 1/4 +(add))
        return result
    else:
        return "{:.2f}".format(0.00)
    
print(series(0))
print(series(1))
print(series(2))
print(series(3))
print(series(4))
print(series(5))
