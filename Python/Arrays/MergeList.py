# In order to win the prize for most cookies sold, my friend Alice and I are going to merge our Girl Scout Cookies orders and enter as one unit.
# Each order is represented by an "order id" (an integer).
# We have our lists of orders sorted numerically already, in arrays. Write a method to merge our arrays of orders into one sorted array.


import numpy as np
def mergeList(a, b):

    
    new_list = []

    a_Pointer = 0
    b_Pointer = 0
    a_Finished = False
    b_Finished = False

    # Edge cases that takes care of empty list
    if not a:
        return b
    elif not b:
        return a

    for x in range(len(a)+len(b)):
        # The reason I am using a boolean instead 
        a_Finished = a_Pointer > len(a) - 1
        b_Finished = b_Pointer > len(b) - 1

        if not a_Finished and (b_Finished or a[a_Pointer] < b[b_Pointer]):
            new_list.append(a[a_Pointer])
            a_Pointer += 1
        
        else:
            new_list.append(b[b_Pointer])
            b_Pointer += 1

    return new_list

a = [3, 4, 6, 10, 11]
b = [1, 5, 8, 12, 14, 19]
print(mergeList(a, b))