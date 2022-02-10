# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. import math to use math.pi
# 2. define cicle(), feed it the formulas for area and circumference.
# 3. Have circle() print the results of the calculations in order of radius, area, & circumference.
# 4. Ensure all outputs are centered, and radius is 8 char wide with one decimal, & area/circumference
#    are 12 char wide with four decimals. Ensure values in the thousands have commas.
# End Program

import math

def circle(r):
    area = math.pi*r**2
    circum = 2*math.pi*r
    print(f'{r:^8,.1f}{area:^12,.4f}{circum:^12,.4f}')
