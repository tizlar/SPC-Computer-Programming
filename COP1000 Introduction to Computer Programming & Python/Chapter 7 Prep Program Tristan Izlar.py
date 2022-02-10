# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Create an empty list
# 2. Use a for loop to assign a random int 50-100 to each index. Make the list 12 elements long.
# 3. Print the results on a single line seperated by spaces.
# 4. Print out the 4th element, 9th index, and smallest element
# 5. Call function change_list on the created list.
# 6. Slice the list to only the middle six elements. Display the new length.
# 7. Sort the list in ascending order, display the results on a single line seperated by spaces.
# End Program

import random

def main():

    empty_list = []
    
    for i in range(12):
        empty_list.insert(i,random.randint(50,100))

    print('Here is a list of random integers...')    

    for i in range(len(empty_list)):
        print(empty_list[i], end=' ')

    print()
    
    print(f'The 4th element of the list is {empty_list[3]}')
    
    print(f'The element at index 9 is {empty_list[9]}')
    
    print(f'The smallest element in the list is {min(empty_list)}')

    new_list = change_list(empty_list)

    print('change_list returned this sorted list...')
    
    for i in range(len(new_list)):
        print(new_list[i], end=' ')           
    
def change_list(old_list):
    
    new_list = old_list[3:-3]
    
    print(f'The size of the list is now {len(new_list)}')
    
    new_list.sort()
    
    return new_list
    
  
        
main()

#collaborators: none
