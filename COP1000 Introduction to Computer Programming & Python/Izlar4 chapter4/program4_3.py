# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get user to input a number of rows they want to see.
# 2. Use while to set up a pretest of the user input.
# 3. Within while, use nested for statement to iterate through the rows. Print a new line each for iteration and subtract 1 from for loop range.
#    This will run until the range no longer is acceptable for the while condition.
# End Program


def main():

    num = int(input('Enter the number of rows you wish to see: '))

    while num > 0:
        for a in range(num):
            print(a,sep='',end='')
        print()
        num -= 1
                  
main()

#collaborators: none
