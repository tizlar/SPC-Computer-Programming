# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Display the MoonBuck coffee prices per pound.
# 2. Create constants for shipping per pound, the price per pound, & sales tax.
# 3. Get the user to input the amount of pounds of coffee they would like to order.
#    Inform them that partial pounds are not sold. Assign the value to "order_amount".
# 4. Using elif statments calulate the cost of the coffee, the sales tax due, the shipping fee due,
#    and the total amount due (dependent on the price bracket) for the order and assign to appropriate variable names.
# 5. Display the cost of the coffee, the sales tax due, the shipping fee due, and the total amount due for the order.
# End Program


def main():

#Information on coffee prices per pound
    print('Current MoonBucks Coffee Company - Coffee Prices\n     40 pounds or more: $7.50 per lb.\n     20 pounds or more: $8.75 per lb.\n' +
          '     10 pounds or more: $10.00 per lb.\n     1 to 9 pounds: $12.00 per lb.')

#Constants
    ONE_TO_NINE = 12.00
    TEN_OR_MORE = 10.00
    TWENTY_OR_MORE = 8.75
    FOURTY_OR_MORE = 7.50
    SHIPPING_PER_POUND = 1.00
    SALES_TAX = .07

#User input
    order_amount = int(input('\nPlease enter the number of pounds you are ordering (whole pounds only): '))

#elif statements/price bracket calculations
    if order_amount >= 1 and order_amount <= 9:
        coffee_cost = order_amount * ONE_TO_NINE
        order_tax = coffee_cost * SALES_TAX
        shipping_fee = order_amount * SHIPPING_PER_POUND
        order_total = coffee_cost + order_tax + shipping_fee

    elif order_amount >= 10 and order_amount <= 15:
        coffee_cost = order_amount * TEN_OR_MORE
        order_tax = coffee_cost * SALES_TAX
        shipping_fee = order_amount * SHIPPING_PER_POUND
        order_total = coffee_cost + order_tax + shipping_fee

    elif order_amount >= 16 and order_amount <= 19:
        coffee_cost = order_amount * TEN_OR_MORE
        order_tax = coffee_cost * SALES_TAX
        shipping_fee = 0
        order_total = coffee_cost + order_tax + shipping_fee

    elif order_amount >= 20 and order_amount <= 39:
        coffee_cost = order_amount * TWENTY_OR_MORE
        order_tax = coffee_cost * SALES_TAX
        shipping_fee = 0
        order_total = coffee_cost + order_tax + shipping_fee

    elif order_amount >= 40:
        coffee_cost = order_amount * FOURTY_OR_MORE
        order_tax = coffee_cost * SALES_TAX
        shipping_fee = 0
        order_total = coffee_cost + order_tax + shipping_fee

    elif order_amount <= 0:
        coffee_cost =  0
        order_tax = 0
        shipping_fee = 0
        order_total = 0

#Order Summary Display
    if order_amount > 0:
        print(f'\nCost of Coffee: ${coffee_cost:,.2f}')
        print(f'7% Sales Tax: ${order_tax:,.2f}')
        print(f'Shipping Fee: ${shipping_fee:,.2f}')
        print(f'Total Amount Due: ${order_total:,.2f}\n')

    else:
        print('\nYou did not enter an acceptable amount of coffee.\n')

main()
