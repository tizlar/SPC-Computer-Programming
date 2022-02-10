# Tristan Izlar SPC ID# 00002491103
#COP1000

# Start Program
# 1. Get the user to enter an integer, and assign it to int1.
# 2. Get the user to enter an integer larger than the last, and assign it to int2.
# 3. Calculate the remainder of the larger variable divided by the smaller one and assign to remain.
# 4. Print the results of the calculation.
# End Program

def main():
# Variables
    int1 = int(input('Enter an integer value: '))
    int2 = int(input('Enter an integer value greater than the one previously entered: '))

# Calulation
    remain = int2 % int1

# Display of results
    print(f'The remainder is {remain}.')

main()

#Collaborators: None
