# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Import custom module & random module
# 2. In main, print headings formatted centered with spacing as follows: RADIUS 8, AREA 12, CIRCUMFERENCE 12
# 3. Create for loop that iterates 7 times, and generates a random int between 40-80 each iteration to be used as my custom module function arguement.
# End Program

#importing custom module
import circle
import random

#def main
def main():

#displaying headings
    h1 = 'RADIUS'
    h2 = 'AREA'
    h3 = 'CIRCUMFERENCE'
    print(f'{h1:^8}{h2:^12}{h3:^12}')

#loop to create table of values using custom module function
    for i in range(7):
        circle.circle(random.randint(40,80))
   
main()

#collaborators: none
