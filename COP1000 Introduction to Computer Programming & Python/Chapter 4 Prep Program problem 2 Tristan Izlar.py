# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get the user to input an initial integer value. Include a sentinel value to allow the user to exit the loop at will.
# 2. Use while loop to pretest their choice, if the response isn't zero then run a loop iteration.
# 3. Create a variable that calculates the remainder of a two division (if the remainder is anything but 0 it is odd).
# 4. Use an if-else statement to show whether the user input was even or odd, and add another input statement to stop the loop from running infinitely.
# 5. When the user does trigger the sentinel, display "All done!" & ensure the funtion is no longer looping.
# End Program


def main():

    integer = int(input('Enter an integer or 0 to quit: '))

    while integer != 0:

        remain = integer % 2

        if remain == 0:
            print(f'\n{integer} is an even number.')
            integer = int(input('\nEnter an integer or 0 to quit: '))
        else:
            print(f'\n{integer} is an odd number.')
            integer = int(input('\nEnter an integer or 0 to quit: '))

    print('All done!')
    

main()

#collaborators: none
