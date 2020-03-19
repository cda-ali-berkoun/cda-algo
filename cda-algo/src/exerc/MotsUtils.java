package exerc;

public class MotsUtils {

	public static String inverser(String src) {
		int taille = src.length();
		String dest = "";

		for (int i = taille - 1; i >= 0; i--) {
			dest = dest + src.charAt(i);
		}

		return dest;
	}

	public static String caracteresCommuns(String src1, String src2) {
		String dest = "";
		int taille1 = src1.length();
		int taille2 = src2.length();

		if (taille1 > taille2) {
			String c;
			c = src2;
			src2 = src1;
			src1 = c;
		}

		for (int i = 0; i < taille1; i++) {

			for (int j = 0; j < taille2; j++) {
				if (src1.charAt(i) == src2.charAt(j) && !dest.contains(String.valueOf(src2.charAt(j)))) {

					dest = dest + "," + src2.charAt(j);
				}
			}
		}

		return dest;
	}

	public static boolean estUnPalindrome(String src) {
//		if (src.equals (inverser(src))) {
//			return true;
//		}else {
//			return false;
//		}

		return src.equalsIgnoreCase((inverser(src)));

//		boolean b = false;
//		if (src.equals (inverser(src))) {
//			b = !b;
//		}
//		return b;
	}

	public static int sommeChiffresDansMot(String src) {
		int somme = 0;

		for (int i = 0; i < src.length(); i++) {
			char chr = src.charAt(i);

			if (Character.isDigit(chr)) {
				somme += Character.getNumericValue(chr);
			}

		}
		return somme;
	}

	public static String devinerAlgo(int a) {
		String dest = "";
		int m;
		int s;

		m = a * 2;
		s = a - 1;
		dest = Integer.toString(m) + Integer.toString(s);
		return dest;

	}

	public static int valeurBin(String str) {
		int res = 0;
		int taille = str.length();

		for (int i = taille - 1; i >= 0; i--) {
			int j = (taille - 1) - i;

			res = (int) (res + Character.getNumericValue(str.charAt(i)) * Math.pow(2, j));

		}

		return res;

	}

	public static long sommeUnicodes(String str) {
		long res = 0;
		int taille = str.length();

		for (int i = 0; i < taille; i++) {
			res += str.charAt(i);
		}

		return res;

	}

	public static String exercice29(int a, int b) {
		String str = "";
		if (a % 2 == 0) {
			a--;
		}
		for (int i = 0; i < b; i++) {

			a += 2;

			str = str + "*" + a;
		}
		return str.substring(1);
	}

	public static String exercice30(String a) {
		String str = "";
		String res1;
		String res2;

		int pointIndex = a.indexOf('.');

		if (pointIndex == -1) {
			a += ".0 ";
			pointIndex = a.length() - 2;
		}
		res1 = a.substring(0, pointIndex);

		res2 = a.substring(a.indexOf('.') + 1);

		int res = sommeChiffresDansMot(res1) + sommeChiffresDansMot(res2);

		str = "T" + res + "E" + sommeChiffresDansMot(res1) + "D" + sommeChiffresDansMot(res2);
		return str;
	}

	public static String exercice31(String src) {
		String res = " ";
		int taille = src.length();

		for (int i = 0; i < taille; i++) {

			res += Character.toLowerCase(src.charAt(i)) - 96;
		}

		return res;
	}

	public static String exercice32(String src) {
		String res = "";
		String digit = "";
		int taille = src.length();
		int digitInt = 0;
		char caractereEnCours;

		for (int i = 0; i < taille; i++) {
			caractereEnCours = src.charAt(i);
			if (Character.isDigit(caractereEnCours)) {
				digit = digit + caractereEnCours;
				continue;
			}
			if (digit.length() != 0) {
				digitInt = Integer.parseInt(digit);
				for (int j = 1; j < digitInt; j++) {
					res += caractereEnCours;
				}
			}

			res += caractereEnCours;
			digitInt = 0;
			digit = "";

		}
		return res;

	}

	public static int afficherNombreOccurence(String str) {
		int res = 0;
		int taille = str.length()-1;
		String chrExist = "";
		str =  str.toLowerCase();
		for (int i = taille; i >= 0; i--) {
			res = 1;
			if(chrExist.contains(String.valueOf(str.charAt(i)))) {
				continue;
				}
		
			for (int j = 0; j < i; j++) {
				if (str.charAt(j)== str.charAt(i)) {
					res += 1;
				}
			}
			
			System.out.println(str.charAt(i) + ":" + res); 
			chrExist+=str.charAt(i) ;
		}

		return res;

	}
	
}
