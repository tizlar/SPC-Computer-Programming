// SPC ID 00002491103 Tristan Izlar


// use a while loop to determine 15 integers that are exclusively
// even or multiples of 4, starting at the number 1. Print 5 integers per line,
// and ensure they are right aligned 6 characters wide. On a fourth line
// print the running total of all the integers .
// Since all multiples of 4 are even, we can expect to see all even 
// numbers that are not multiples of 4 in our results, if the 
// exclusive or is working correctly.

package izlar5;

public class Program51 {

	public static void main(String[] args) {

	int num = 1, sum = 0, count = 0;
	while(count <  15) {
		
		if(num % 2 == 0 ^ num % 5 == 0) {
			
			if(count % 5 == 0) {
				System.out.println();
			}
			
			System.out.printf("%6d ", num);
			sum += num;
			num++;
			count++;
			
		}
		else {
			num++;
		}
	}
	System.out.println();
	System.out.println("Total: " + sum);
	}

}
