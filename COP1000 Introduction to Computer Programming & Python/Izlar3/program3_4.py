# Tristan Izlar SPC ID# 00002491103
# COP1000

# Start Program
# 1. Get the user to respond to a queston with an int response type, notify them if it was corect or not using an if statement.
# 2. Get the user to respond to a queston with an float response type, notify them if it was corect or not using an if statement.
# 3. Get the user to respond to a queston with an string response type, notify them if it was corect or not using an if statement.
# End Program


def main():


#question 1
    q1 = int(input('\nWhat is 20 divided by 2? '))

    if q1 == 10:
        print('\nCorrect! Next question...')
    else:
        print('\nIm sorry, the correct answer was 10. Next question...')


#question 2
    q2 = float(input('\nWhat is 5 divided by 2? '))

    if q2 == 2.5:
        print('\nCorrect! Next question...')
    else:
        print('\nIm sorry, the correct answer was 2.5. Next question...')


#question 3
    q3 = str(input('\nWhat is something you should drink everyday? '))

    if q3 == 'water' or q3 == 'Water' or q3 == 'water.' or q3 == 'Water.' or q3 == 'WATER':
        print('\nCorrect! Well done on this quiz & staying hydrated!')
    else:
        print('\nIm sorry, the correct answer was water. This quiz is completed. Please drink more water!')



main()

#collaborators: none
