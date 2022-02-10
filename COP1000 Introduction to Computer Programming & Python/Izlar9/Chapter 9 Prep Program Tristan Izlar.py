# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1.Created a dictionary of state abbreviations (key), and capital (value). Add data for any four states.
# 2.Use a function to display the current count of the amount of states in the dictionary.
# 3.Use a while loop to allow the user to add more key-value pairs. Let them quit by pressing enter. Prompt the user if an entry already exists.
# 4.Display the new count of states/capitals.
# 5.Print each entry in the dictionary.
# 6.Using dictionary comprehensions, create a dictionary with keys as ints 1:9 (odd), and vals as the cubes of those.
# 7.Display the key and val pair on each line, without using items().
# End Program

def main():

#initial dictionary
    state_capital = {'FL':'Tallahassee','AZ':'Pheonix','OR':'Salem','UT':'Salt Lake City'}

#initial count
    print(f'There are currently {len(state_capital)} states in the dictionary.')
    print('Lets add some more!')

#while loop
    add_state = ' '
    
    while add_state != '':
        
        add_state = input('Enter a state abbreviation or press Enter to quit: ')

        if add_state in state_capital.keys():
            old_capital = state_capital.get(add_state)
            print(f'{add_state} is already in this dictionary, the capital is {old_capital}.')
        elif add_state == '':
            break
        else:
            add_capital = input(f'Enter the capital of {add_state}: ')
            state_capital[add_state] = add_capital

#New count
    print()
    print(f'There are now {len(state_capital)} states in the dictionary.')

#loop to display items
    for state, capital in state_capital.items():
       print(f'The capital of {state} is {capital}.')


#odd ints, cubes, & dictionary comprehension

    print('\nSome cubes made with a dictionary comprehension...')
    odd_ints = [1,3,5,7,9]
    cube_vals = {item:item**3 for item in odd_ints}

    for key in cube_vals.keys():
        val = cube_vals.get(key)
        print(f'{key} cubed is {val}.')

main()

#collaborators: none
