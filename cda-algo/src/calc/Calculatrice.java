package calc;

public class Calculatrice {

	public static int addition(int a, int b) {
		int s;
		s = a + b;
		return s;
	}

	public static int soustraction(int a, int b) {
		int s;
		s = a - b;
		return s;
	}

	public static int multiplication(int a, int b) {
		int m;
		m = a * b;
		return m;
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static char signe(int a) {
		if (a < 0) {
			return '-';
		} else {
			return '+';
		}

	}

	public static int factorielle(int a) {

		int fact = 1;
		for (int i = a; i > 0; i--) {

			fact = fact * i;
		}
		return fact;
	}
	public static boolean conjonction(boolean a, boolean b) {
		return a && b;
	}
	public static boolean disjonction(boolean x, boolean y) {
		return x || y;
	}
	public static boolean negation (boolean a) {
		return !a;
	}
	public static int aleatoireInferieur(int a) {

		return (int) (Math.random() * a);
	}
}
