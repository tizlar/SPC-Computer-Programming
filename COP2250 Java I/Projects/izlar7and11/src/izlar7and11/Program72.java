// SPC ID 00002491103 Tristan Izlar

// following the video, I went should go to...
// .java file > Run As.. > Run Configurations > Arguments > Enter them & hit apply
// utilize the args[] given from the command prompt and parse the arguments I entered
// and perform my calculation.

package izlar7and11;

public class Program72 {

	public static void main(String[] args) {
		System.out.print("Sides: ");
		
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
		int area = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
		System.out.println("Area is " + area);
	}

}
