# Tristan Izlar SPC ID# 00002491103
#COP1000

# Start Program
# 1. Get the user to enter their hours worked this week, and assign it to hours_worked.
# 2. Get the user to enter their current hourly pay rate, and assign it to pay_rate.
# 3. Calculate the weekly pay of the user and assign to weekly_pay.
# 4. Print the results of the calculation in currency format.
# End Program

def main():
# Variables
    hours_worked = float(input('Enter the hours you worked this week: '))
    pay_rate = float(input('Enter your hourly pay rate: '))

# Calculation
    weekly_pay = hours_worked * pay_rate

# Display of results
    print(f'You earned ${weekly_pay:,.2f} this week.')

main()

#Collaborators: None
