# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get the user to enter the start of the pounds range, the stopping point, and the interval amount to be converted to kilograms.
# 2. Store conversion value as constant.
# 3. Display headers for your table that are aligned to their columns.
# 4. Using a for loop, complete the conversion. Ensure pounds amount have two decimal places and are center aligned in a 10 character column.
#    Ensure kilogram amounts have three decimal places and are right aligned in a 12 character column.
# End Program


def main():

#initial input from user
    start = int(input('Enter the starting point for pounds conversion: '))
    stop = int(input('Enter the stopping point for pounds conversion: '))
    step = int(input('Enter the step amount for pounds conversion: '))

#store the conversion rate for kg to lbs
    LBS_IN_KG = 2.20462
    
#table display
    print(format('POUNDS','^10'),format('KILOGRAMS','>12'))
    
    for lb in range(start,stop+1,step):
        kilograms = lb / LBS_IN_KG
        print(f'{lb:^10.2f}{kilograms:>12.3f}')
        
    
main()

#collaborators: none

