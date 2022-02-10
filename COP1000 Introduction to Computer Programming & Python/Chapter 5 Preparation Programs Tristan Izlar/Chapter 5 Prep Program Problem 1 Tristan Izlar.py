# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Import random module
# 2. Define the main function, and generate 2 random integers with an inclusive range 1 through 5 within.
# 3. Call show_larger function within main.
# 4. Define a function called show_larger, and use the 2 random integers as parameters.
# 5. Add statements to the show_larger function to show which integer is larger and by how much, or if they are equal.
# 6. Call main function. 
# End Program

import random

def main():
    rand_one = random.randint(1,5)
    rand_two = random.randint(1,5)
    show_larger(rand_one,rand_two)

def show_larger(n1,n2):
    if n1 > n2:
        print(f'{n1} is larger than {n2} by {n1 - n2}.')

    elif n2 > n1:
        print(f'{n2} is larger than {n1} by {n2 - n1}.')

    else:
        print(f'The integers are equal, both are {n1}.')
        

main()

#collaborators: none
