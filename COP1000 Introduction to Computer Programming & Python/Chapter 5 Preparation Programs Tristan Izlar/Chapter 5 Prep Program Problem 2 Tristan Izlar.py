# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Import the temps module.
# 2. In main, prompt the user to enter a temperature (as a float type).
# 3. In main, prompt the user to indicate the temperature scale of the temperature just entered (C or F).
# 4. Call the appropriate function from the temps module using the input value as a parameter (based off the selected temp scale.
# 5. Ensure if f_to_c is called that the results are printed accurate to three decimal places & in the same format at the c_to_f string.
# End Program

import temps

def main():

#user input section
    temp = float(input('\nEnter a temperature: '))
    scale = input('\nWas that input Fahrenheit or Celsius (c or f):  ')

#if-else statement in control of which function to call
    if scale == 'f' or scale == 'F':
        result = temps.f_to_c(temp)
        print(f'\n{temp:.1f} Fahrenheit is {result:.3f} Celsius.') 

    elif scale == 'c' or scale == 'C':
        temps.c_to_f(temp)

    else:
        print('\nYou did not enter a valid input.')


main()
    

#collaborators: none
