# Your team is scrambling to decipher a recent message, worried it's a plot to break into a major European National Cake Vault. 
# The message has been mostly deciphered, but all the words are backward! Your colleagues have handed off the last step to you.
# Write a function reverse_words() that takes a message as a list of characters and reverses the order of the words in place. ↴
message = [ 'c', 'a', 'k', 'e', ' ',
            'p', 'o', 'u', 'n', 'd', ' ',
            's', 't', 'e', 'a', 'l' ]
message2 = [ 't', 'h', 'e', ' ', 'e', 'a', 'g', 'l', 'e', ' ',
  'h', 'a', 's', ' ', 'l', 'a', 'n', 'd', 'e', 'd' ]

message3 = [ 'a', ' ', 'b', 'b', ' ', 'c', ' ', 'd', 'd', ' ',
  'e', ' ', 'f', 'f', ' ', 'g', ' ', 'h', 'h' ]
# message1 = ['t','h','e', ' ', 'b','r',own dog jumped over the lazy fox]
# Edge Cases: 
    # If the word at the end doesnt have a space
    # question: are one letters consider a word an can you give me an example of that input

# First solution that comes to mind (talk out loud through typing in this case)
# So the first thing that comes in mind is that I can reverse the the list which means reversing everything in the list.
# Reverse all the characters in list
# flip all words when theres a space to the original word and store that in a temp variable
# How would I store it? I would do a temp.insert(0,x) for every letter the loop is going through. This way we get the original word back
# and replace it with flipped wdord
# I would need a start_variable
#

# O(n) solution with O(1) space complexity
# Questions
# the last word would be adjusted for an edgecase?

def reverse_characters(message):
    right = len(message) - 1
    temp = ''
    for i in range(int(len(message)/2)):
        temp = message[i]
        message[i] = message[right]
        message[right] = temp
        right -= 1
    return message
print(message)
print(reverse_characters(message))

def reverse_list(message):
    message = reverse_characters(message)
    temp = []
    start = 0

    for i, x in enumerate(message):
        if x == ' ' or i == len(message)-1:
            if len(message)-1 == i:
                temp.insert(0,x)
                message.pop()
            message[start:i] = temp
            if i != len(message)-1:
                start = i+1
            temp = []
        else:
            temp.insert(0,x)
    return message
# print(message2)
# print(reverse_list(message2))

# print(message3)
# print(reverse_list(message3))