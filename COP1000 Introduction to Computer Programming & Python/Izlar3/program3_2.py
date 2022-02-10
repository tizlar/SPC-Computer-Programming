# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get the user to enter an even integer in the 20s and assign to a variable.
# 2. Use an if with logical operators (remainder & "and") to determine if the input was good or bad.
# 3. Display the result of the if to the user with print statements.
# End Program


def main():

#get input from user
    integer = int(input('\nPlease enter an even integer in the 20s range: '))


#if & display for user

    if (integer % 2 == 0) and (integer >= 20 and integer <= 29):
        print('\nGood input')

    else:
        print('\nBad input')


main()

#collaborators: none
