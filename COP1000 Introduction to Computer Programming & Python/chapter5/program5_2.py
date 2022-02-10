# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Prompt user to enter the quantity of cars sold.
# 2. Create variables for an initial commission and sale value.
# 3. Create custom function to create constants, print sale commission, and return sale commission value for use in later calculations.
# 4. Create a for loop that gets user input for selling price, front end profit, & back end profit. Call your custom function to display sale commission.
#    Create variables to store the running total of sales and commission. Ensure the loop iterates for every sale.
# 5. Display total sales and commissions for user.
# End Program


def main():

#User input section
    qty = int(input('How many cars did you sell: '))


#Inital Sales and commission values
    total_commission = 0
    total_sales = 0

    
#Loop to display commission on each car, and perform running total or sales/commissions.
    for i in range(qty):
        sales_price = float(input('\nEnter car selling price: '))
        front_profit = float(input('Front-end profit this car: '))
        back_profit = float(input('Back-end profit this car: '))
        sale_commission = sale_summary(front_profit,back_profit)
        total_sales += sales_price
        total_commission += sale_commission


#Total sales and total commissions report for user
    print(f'\nYour total sales for period: ${total_sales:,.2f}')
    print(f'Your total commission: ${total_commission:,.2f}')


#Custom function to calculate commission per sale.
def sale_summary(front, back):
    FRONT_RATE = .25
    BACK_RATE = .05
    sale_commission = front * FRONT_RATE + back * BACK_RATE
    print(f'You made ${sale_commission:,.2f} on this sale.')
    return sale_commission

    
main()

#collaborators: none
