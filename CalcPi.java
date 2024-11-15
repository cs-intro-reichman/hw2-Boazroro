// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {

		int first = Integer.parseInt(args[0]);

		if (first > 0) {

			double pi = 0.0;

			for (int i = 0; i < first; i++) {

				double sum = 1.0 / (2 * i + 1);

				if (i % 2 == 0) {
					pi = pi + sum;
				} else {
					pi = pi - sum;
				}
			}

			pi = pi * 4;

			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated: " + pi);
		}
	}
}
