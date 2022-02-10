# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Create a for loop to cycle through an integer range of 5-50 on increments of 5
# 2. Add a statement to print the integer, the square, and cube of each iteration.
# 3. Ensure output is in three columns and each column is 7 characters wide.
# End Program


def main():

    for x in range(5,51,5):
        print(f'{x:^7}{x**2:^7}{x**3:^7}')

main()

#collaborators: none
