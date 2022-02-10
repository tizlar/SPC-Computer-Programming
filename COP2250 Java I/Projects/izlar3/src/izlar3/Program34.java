// SPC ID 00002491103 Tristan Izlar

package izlar3;

// this program takes a random number
// from 20-100 inclusive, and calculates the 
// ordinal position using arithmetic.
// the number is then broken down into
// separate parts and based on the ending digit,
// it is given a certain ordinal suffix in the
// results.

public class Program34 {

	public static void main(String[] args) {
		int num = 20 + (int)(Math.random() * 81);
		int tenth = (int)(num / 10) * 10; 
		int smallVal = num - tenth;
		String suffix;
		switch(smallVal) {
		case 1: suffix = "st";
		break;
		case 2: suffix = "nd";
		break;
		case 3: suffix = "rd";
		break;
		default: suffix = "th";
		}
		System.out.printf("%d%s", num, suffix);

	}

}
