# To do this, you’ll need to know when any team is having a meeting. In HiCal, a meeting is stored as a tuple ↴ of integers (start_time, end_time). 
# These integers represent the number of 30-minute blocks past 9:00am.

# For example:

# (2, 3)  # Meeting from 10:00 – 10:30 am
# (6, 9)  # Meeting from 12:00 – 1:30 pm
# For example, given:

#   [(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)]

# Python 3.6
# your function would return:

#   [(0, 1), (3, 8), (9, 12)]

# Cases to run:
#  [(1, 2), (2, 3)]
#  [(1, 5), (2, 3)]
#  [(1, 10), (2, 6), (3, 5), (7, 9)]


# The approach that will be used in this problem is the greedy method
# Why the greedy method? It's because the first choice of the meeting will be taken first since its the most optimal choice
# Condensing the meeting dates. If 1st meeting date goes from a beginning time to a time that takes the whole day then
# we can ignore that factor.

# Edge cases:
# 1) Merge time together if the the current starting is less than or equal to the previous ending time. 
# 2) If the ending time of the previous meeting is larger than the current time then the greater end time of the two

times = [(1, 10), (2, 6), (3, 5), (7, 9)]
def merge_meetings(arr):
    arr = sorted(arr)
    # Sorted array based from initial time.
    # [(0,1), (3, 5), (4, 8), (9, 10), (10, 12)]

    new_list = []
    new_list.append(arr[0])
    # Temp variable to compare past meeting time and current meeting to see if we need to merge it or not
    temp = arr[0]
    for i in arr[1:]:
        # Merge the two times
        if i[0] <= temp[1]:
            new_list[-1] = (temp[0], max(temp[1], i[1]))
        else:
            new_list.append(i)
            temp = i

    return new_list

print(merge_meetings(times))