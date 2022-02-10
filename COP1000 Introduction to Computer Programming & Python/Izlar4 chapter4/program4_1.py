# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get a first name and a small integer from the user.
# 2. Use a while loop to pretest conditions. If responses were valid, print name on one line
#    as many times as the integer value entered.
# 3. Use a for loop to do the exact same thing in the inner loop.
# 4. Give user option to enter more inputs or exit program.
# End Program


def main():

#initial input from user & sentinel
    name = input('Enter a first name: ')
    integer = int(input('\nEnter a small positive integer: '))
    print()

#while loop printing the name on one line x number of times
    while integer != 0 and name != '':
        print(name * integer)

#for loop printing the name on one line x number of times
        for x in range(integer):
            print(name, sep=' ', end='')

#infinte loop prevention
        name = ''
        integer = 0
    
    print('\n\nGoodbye!')
    
main()

#collaborators: none
