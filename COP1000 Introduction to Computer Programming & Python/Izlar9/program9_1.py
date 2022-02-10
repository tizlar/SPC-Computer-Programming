# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1.Created a dictionary of gamers (Darius 1, Niesha 2, Keshawn 1, Jaden 0, Lanelle 2).
# 2.Display a table of the dictionary (using .items()) with 'PLAYER' and 'WINS' titles.
#   Make the keys column 10 spaces left aligned. Make the values column 4 spaces right aligned.
# 3.Display gamers keys and values using keys and values methods.
# 4.Add Khloe to group and delete Niesha.
# 5.Update the scores to reflect Jadens 2 wins and Khloes 3 wins.
# 6.Print the most current scores into a table without using an items() method.
# 7.Clear the dictionary.
# End Program

def main():

#initial dictionary
    gamers = {'Darius': 1, 'Niesha': 2, 'Keshawn': 1, 'Jaden': 0, 'Lanelle': 2}

#loop to display table
    h1 = 'PLAYER'
    h2 = 'WINS'
    h3 = '------'
    h4 = '----'
    print(f'{h1:<10}{h2:>4}')
    print(f'{h3:<10}{h4:>4}')
    for k, v in gamers.items():
       print(f'{k:<10}{v:>4}')

#display of keys and values
    print(f'The keys are {gamers.keys()}.')
    print(f'The values are {gamers.values()}.')
    
#addition of Khloe and removal of Niesha
    gamers['Khloe'] = 0
    del gamers['Niesha']

#current count of gamers
    print(f'There are now {len(gamers)} gamers.')
    print()

#updating scores
    gamers['Jaden'] = 2
    gamers['Khloe'] = 3

#updated table
    print('GAMERS GROUP: NEW STANDINGS')
    print(f'{h1:<10}{h2:>4}')
    print(f'{h3:<10}{h4:>4}')
    for k in gamers:
        print(f'{k:<10}{gamers[k]:>4}')

#table clear
    gamers.clear()
    print('The dictionary was deleted.')

main()

#collaborators: none
