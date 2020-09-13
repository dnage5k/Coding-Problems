# Write a function that takes a list of characters and reverses the letters in place.

# The first method I am doing will be answering the question.

characters = ['1','2']



def inplace(arr):
    j = len(characters)-1
    temp = ''
    for i in range(int(len(arr)/2)):
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        j-=1

    return arr

print(inplace(characters))