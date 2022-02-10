# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Define c_to_f, a void function that converts Celsius to Fahrenheit, and prints F accurate to 3 decimal places.
# 2. Define f_to_c, a value returning function that converts Fahrenheit to Celsius, and returns the result of the calculation.
# 3. Save the program as temps.py, which be used later as a module.
# End Program


#void function - c_to_f
def c_to_f(c_temp):
    f_temp = (c_temp * 9 / 5) + 32
    print(f'\n{c_temp:.1f} Celsius is {f_temp:.3f} Fahrenheit.') 

#value returning function - f_to_c
def f_to_c(f_temp):
    c_temp = (f_temp - 32) * 5 / 9
    return c_temp

#collaborators: none
