# Tristan Izlar SPC ID# 00002491103
#COP1000

# Start Program
# 1. Assign 0.07 to a constant called SALES_TAX_RATE.
# 2. Get the user to enter the amount of an a item they bought more than one of, and assign it to quantity1.
# 3. Get the user to enter the cost of one of the items they bought, and assign it to price1.
# 4. Get the user to enter the amount of some other item they bought more than one of, and assign it to quantity2.
# 5. Get the user to enter the cost of one of the items they bought, and assign it to price2.
# 6. Calculate the sale subtotal, total sales tax, and the total cost of the purchase.
# 7. Print the results of the calculations in currency format.
# End Program

def main():
# Variables/Constant
    SALES_TAX_RATE = 0.07
    quantity1 = float(input('Enter the quantity of taxable merchandise you recently bought more than one of: '))
    price1 = float(input('Enter the price for one of these items: '))
    quantity2 = float(input('Enter the quantity of some other taxable merchandise you recently bought more than one of: '))
    price2 = float(input('Enter the price for one of these items: '))

# Calulations
    item_one = quantity1 * price1
    item_two = quantity2 * price2
    subtotal = item_one + item_two
    sales_tax = subtotal * SALES_TAX_RATE
    total_cost = subtotal + sales_tax
    

# Display of results
    print('\n')
    print(f'Subtotal: ${subtotal:.2f}')
    print(f'Total Sales Tax: ${sales_tax:.2f}')
    print(f'Total Cost of Purchase: ${total_cost:.2f}\n')
    
main()

#Collaborators: None
