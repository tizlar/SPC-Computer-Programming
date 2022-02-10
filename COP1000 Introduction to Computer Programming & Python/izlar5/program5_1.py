# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. In main, prompt user to enter unit price and quantity of units.
# 2. Call the void function and the value-returning fuction appropriately
# 3. Define the void function (a cost calculation and then a print statement).
# 4. Define the value-returning function (just the return of the cost calculation).
# 5. Call main.
# End Program


def main():

#User input section
    price = float(input('Enter the unit price: '))
    qty = int(input('Enter the quantity: '))

#void function call
    void_func(price,qty)

#value-returning function call
    print(f'Please pay ${value_func(price,qty):,.2f}.')


#custom functions
def void_func(p,q):
    cost = p * q
    print(f'Please pay ${cost:,.2f}.')

def value_func (p,q):
    return p * q
    
        

main()

#collaborators: none
