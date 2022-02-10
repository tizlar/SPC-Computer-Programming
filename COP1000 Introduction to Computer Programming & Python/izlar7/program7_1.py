# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Import random module
# 2. Create an empty list.
# 3. Use a for loop to assign a random int 20-70 to each index. Make the list 30 elements long.
# 4. Print the results on a single line seperated by spaces.
# 5. Print out the min and max of the list.
# 6. Check and display if or if not 50 is an element in the list.
# 7. Show ints from index 4-10 using slice.
# 8. Show the last 6 ints in the list using slice.
# 9. Call value returning function and assign results to variable, for more manipulation.
# 10. Sort the list of odd ints in descending order. Display the results on a single line seperated by spaces.
# 11. Sum the list of odd ints and report.
# End Program

import random

def main():

#list creation/display

    list1 = []
    
    for i in range(30):
        list1.append(random.randint(20,70))

    for i in list1:
        print(i,end=' ')

#high/low ints display
       
    print()
    print(f'Highest value in list: {max(list1)}')
    print(f'Lowest value in list: {min(list1)}')

#ints == 50 check

    if 50 in list1:
        print(f'50 was found at index {list1.index(50)}')
    else:
        print('50 was not an element in the list')

#ints from indexs 4-10

    print('The integers from index 4-10 are: ', end='')
    list2 = list1[4:11]
    for i in list2:
        print(i, end= ' ')

#final 6 ints in list

    print()
    print('The final 6 integers in the list are: ',end='')
    list3 = list1[-6:]
    for i in list3:
        print(i, end= ' ')

#value returning function

    results = odd_val(list1)

#num of odd ints from function

    print()
    print(f'The number of elements returned from the odd_val function was {len(results)}')

#sorted/printed odd ints
    results.sort(reverse=True)
    print('All odd integers sorted high to low: ', end='')
    for i in results:
        print(i,end= ' ')

#sum of odd ints

    print()
    total = 0 
    for i in results:
        total += i
    print(f'Sum of odd integers: {total}')
    
    
#value returning function creation

def odd_val(original_list):
    
    list2 = []
    
    for i in original_list:
        if i % 2 != 0:
            list2.append(i)

    return list2
            

    

main()

#collaborators: none
