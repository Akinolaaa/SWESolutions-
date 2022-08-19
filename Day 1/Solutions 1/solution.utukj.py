def compute_series_base(n):
    if n == 1:
        result = 1
    else:
        result = 1/(3*n - 2) + compute_series_base(n-1)
    return result

def compute_series(n):
    return str(round(compute_series_base(n), 2))

print(compute_series(1))
print(compute_series(2))
print(compute_series(5))
