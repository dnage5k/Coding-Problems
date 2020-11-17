import math
# Write an efficient method that checks whether any permutation ↴ of an input string is a palindrome. ↴
# You can assume the input string only contains lowercase letters.

# Examples:

# "civic" should return true
# "ivicc" should return true
# "civil" should return false
# "livci" should return false



def palindrome(word): 
    palindrome_checker= set()
    for x in word:
        if x in palindrome_checker :
            palindrome_checker.remove(x)
        else:
            palindrome_checker.add(x)
    
    return len(palindrome_checker) <= 1
        
print(palindrome('aasd'))