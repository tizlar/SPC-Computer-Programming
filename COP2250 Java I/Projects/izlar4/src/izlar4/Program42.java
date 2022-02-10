// SPC ID 00002491103 Tristan Izlar

// This program takes the values we were given
// and assigns them to objects. Those 
// objects are then used in the pythagorean
// theorem and some basic trig functions 
// to find the missing measurements on the triangle.

package izlar4;

public class Program42 {

	public static void main(String[] args) {
		double angleC = 90;
		double sideA = 8;
		double sideC = 17;
		double angleA, angleB, sideB;
		sideB = Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2)); 
		angleA = sideA / sideC;
		angleA = Math.asin(angleA);
		angleA = Math.toDegrees(angleA);
		angleB = 90 - angleA;
		System.out.printf("Side B = %.2f, Angle A = %.2f, Angle B = %.2f", sideB, angleA, angleB);

	}

}
