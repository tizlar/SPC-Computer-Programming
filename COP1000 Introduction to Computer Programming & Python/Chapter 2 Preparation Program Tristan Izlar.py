# Tristan Izlar COP1000

# Start Program
# 1. Get first test score and assign to a variable.
# 2. Get second test score and assign to a variable.
# 3. Get third test score and assign to a variable.
# 4. Add up all test scores and divide by three; assign result to a variable.
# 5. Display the results formatted as a percent with two decimal places.

test1 = int(input('Enter the score for test 1: '))
test2 = int(input('Enter the score for test 2: '))
test3 = int(input('Enter the score for test 3: '))
avg_score = (test1 + test2 + test3)/3
print(f'The average of these scores is {avg_score:.2f}%.')
