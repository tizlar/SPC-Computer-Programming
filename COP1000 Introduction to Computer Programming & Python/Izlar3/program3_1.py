# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Display the cost of roses by amount ordered.
# 2. Get the amount of roses desired by the user. Inform them to provide the exact number.
# 3. Create if/elif statements to calculate the price per rose for the order.
# 4. Calculate the total cost of the order.
# 4. Display the bill to the user.
# End Program


def main():

#display prices & tax information to user
    print("Rosa's Roses Price Guide\nLess than a Dozen: $1.69 each\n1 Dozen or More: $1.39 each\n"
          + '2 Dozen or More: $1.19 each\n3 Dozen or More: $0.89 each\n Sales Tax: 0%')


#get input from user
    roses = int(input('\nPlease enter the exact number of roses you want to buy: '))


#elif to set purchase price

    if roses >= 36:
        price = 0.89

    elif roses >= 24:
        price = 1.19

    elif roses >= 12:
        price = 1.39

    else:
        price = 1.69

#calculation for total

    total = roses * price


#display bill for user
    print(f'\nTotal Amount Due: ${total:,.2f}')


main()

#collaborators: none
