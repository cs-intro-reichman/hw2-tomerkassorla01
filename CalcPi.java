// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfTerms = Integer.parseInt(args[0]);
		double piApproximated, sum = 0, term;
		int divisor = 1;
		for (int i = 0; i < numberOfTerms; i++) {
			term = (double) 1 / divisor;
			divisor += 2;
			if (i % 2 == 0) {
				sum += term;
			}
			else {
				sum -= term;
			}
		}
		System.out.println(sum);
		piApproximated = sum * 4;
		double piJava = Math.PI;
		System.out.println("pi according to Java: " + piJava);
        System.out.println("pi, approximated:     " + piApproximated);
	}
}
