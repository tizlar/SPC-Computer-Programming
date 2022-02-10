# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get the user to enter an even integer in the 20s and assign to a variable.
# 2. Use an if with logical operators (remainder & "and") to determine if the input was good. If the response is not good, give the reason why using elif.
# 3. Display the result of the if/elif to the user with print statements.
# End Program


def main():

#input from user

    integer = int(input('\nPlease enter an even integer in the 20s range: '))


#if/elif & display for user

    if (integer % 2 == 0) and (integer >= 20 and integer <= 29):
        print('\nGood input.')

    elif (integer % 2 != 0) and (integer >= 20 and integer <= 29):
        print('\nNot even, in range.')

    elif (integer % 2 == 0) and integer >= 30:
        print('\nEven, too high.')

    elif (integer % 2 == 0) and integer <= 19:
        print('\nEven, too low.')

    elif (integer % 2 != 0) and integer <= 19:
        print('\nNot even, too low.')

    elif (integer % 2 != 0) and integer >= 30:
        print('\nNot even, too high.')
        

main()


#collaborators: none
