# Tristan Izlar SPC ID# 00002491103
#COP1000

# Start Program
# 1. Assign a number (1-9) to a float variable called radius.
# 2. Assign 3.1416 to a constant called PI.
# 3. Calculate the area of a circle using the previously defined values & assign to an area variable.
# 4. Print the results of the calculation with up to 4 decimals using an f string.
# End Program

def main():
# Variables/Constants
    radius = float(5)
    PI = 3.1416

# Calulation of area
    area = PI * radius ** 2

# Display of results
    print(f'{area:.4f}')

main()

#Collaborators: None
