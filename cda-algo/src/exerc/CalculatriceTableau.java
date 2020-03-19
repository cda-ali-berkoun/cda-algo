package exerc;

public class CalculatriceTableau {

	public static int sommeElements(int[] tab) {
		int taille = tab.length;
		int somme = 0;
		for (int i = 0; i < taille; i++) {
			int val = tab[i];
//			System.out.println(val);
			somme = somme + val;
		}
		return somme;

	}

	public static int plusPetitElement(int[] petit) {
		int taille = petit.length;
		int val0 = petit[0];
		for (int i = 0; i < taille; i++) {
			int val1 = petit[i];

			if (val0 > val1) {
				val0 = val1;
			}
		}
		return val0;
	}

	public static int sommeElementsDeuxTableaux(int[] tab1, int[] tab2) {
		int taille = tab1.length;
		int somme = 0;
		int somme1 = 0;
		int somme2 = 0;
		for (int i = 0; i < taille; i++) {
			int val1 = tab1[i];
			int val2 = tab2[i];
			somme1 = somme1 + val1;
			somme2 = somme2 + val2;
			somme = somme1 + somme2;
		}

		return somme;
	}

	public static int[] triAscendant(int[] triTab) {

		int taille = triTab.length;
		int i = 0;
		for (i = 0; i < taille; i++) {
			int val0 = triTab[0];
			int val1 = triTab[i];
			if (val0 > val1) {
				val0 = val1;
			}

			triTab[i] = val0;
		}
		return triTab;

	}

	public static boolean conjonction(boolean[] tab) {
		int taille = tab.length;
		boolean bool = true;
		for (int i = 0; bool && i < taille; i++) {
			bool &= tab[i]; // bool = bool + tab[i]
		}
		return bool;
//		for (int i = 0; i < taille; i++) {
//			if (!tab[i]) {
//				return false;
//			}
//
//		}
//		return true;

	}

	public static int nombreDElementsPair(int[] tab) {
		int taille = tab.length;
		int res = 0;
		for (int i = 0; i < taille; i++) {
			if (tab[i] % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	public static boolean chercheSiUnElementExiste(int a, int[] tab) {
		int taille = tab.length;
		boolean bool = false;

		for (int i = 0; !bool && i < taille; i++) {
			if (a == tab[i]) {
				bool = true;

			}

		}
		return bool;
	}

	public static int[] mettreZeroDansLesCasesAIndicesImpair(int[] tab) {
		int taille = tab.length;

		for (int i = 1; i <= taille; i = i + 2) {

			tab[i] = 0;

		}
		return tab;

	}

	public static int[] decalerLesElementsTableauDUneCase(int[] tab) {
		int taille = tab.length;

		int[] tab2 = new int[taille];
		
		tab2[0] = tab[taille - 1];

		for (int i = 1; i < taille; i++) {
			tab2[i] = tab[i - 1];
		}

		return tab2;

	}
}
