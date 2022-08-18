def sum_series_to_nth_term(n):
    """
    This function sum up a certain series up to nth term
    n: this is the value of the nth term to sum to
    """
    #Example:
    # 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

    sum = 0

    # numerator remains constant through the series as 1
    numerator = 1

    # denominator changes by adding of 3 through the series
    # so the series: common difference is 3, first-term is 1, nth term is parameter passed
    # if nth term is passed to the function, then I will use A.P to get the value of nth denominator
    denominator = 1 + (n - 1) * 3

    for num in range(1, denominator + 3, 3):
        sum += (numerator/ num)
    total_sum = "{0:.2f}".format(sum)
    return str(total_sum)


print(sum_series_to_nth_term(1))
print(sum_series_to_nth_term(2))
print(sum_series_to_nth_term(5))