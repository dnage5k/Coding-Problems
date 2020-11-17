# Write a function that takes a list of characters and reverses the letters in place.

# The first method I am doing will be answering the question.

characters = ['1','2','d','3','4','5','6']
print(characters)
# In place means that we will be using the same space to adjust the contents of the variable

# Created a 2nd pointer and a temp variable to switch the characters in place.

# Space complexity is O(1)
# Returning the same variable but with different contents

# Time complexity O(n)
# only iterating through the loop n/2
def inplace(arr):
    j = len(characters)-1

    # The temp variable will hold the first index
    temp = ''

    # I take the range of the for loop to be half because we only have to
    # go through half of them since we have a second pointer
    for i in range(int(len(arr)/2)):
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        j-=1

    return arr

print(inplace(characters))


# Different method in a python way

def secondMethod(arr):
    return arr[::-1]

print(secondMethod(characters))