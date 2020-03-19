package exerc;

import calc.Calculatrice;
import tools.Clavier;

public class Exercices {

	public static void main(String[] args) {
//		Exercices.exercice1();     
//		Exercices.exercice2();   
//		Exercices.exercice3();
//		Exercices.exercice4();
//		Exercices.exercice5();
//		Exercices.exercice6();
//		Exercices.exercice7();
//		Exercices.exercice8();
//		Exercices.exercice9();
//		Exercices.exercice10();
//		Exercices.exercice11();
//		Exercices.exercice12();
//		Exercices.exercice13();
//		Exercices.exercice14();
//		Exercices.exercice15();
//		Exercices.exercice16();
//		Exercices.exercice17();
//		Exercices.exercice18();
//		Exercices.exercice19();
//		Exercices.exercice20();
//		Exercices.exercice21();
//		Exercices.exercice22();
//		Exercices.exercice25();
//		Exercices.exercice26();
//		Exercices.exercice28();
//		Exercices.exercice27();
//		Exercices.exercice29();
//		Exercices.exercice30();
//		Exercices.exercice31();
//		Exercices.exercice32();
//		Exercices.exercice23();
		Exercices.exercice34();
	}

	public static void exercice1() {
		System.out.println("*************************************");
		System.out.println("Addition deux entiers : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.addition(parametreX, parametreY);
		System.out.println("la somme = " + res);
	}

	public static void exercice2() {
		System.out.println("*************************************");
		System.out.println("Soustraction deux entiers : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.soustraction(parametreX, parametreY);
		System.out.println("la soustraction = " + res);
	}

	public static void exercice3() {
		System.out.println("*************************************");
		System.out.println("Multiplication deux entier : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.multiplication(parametreX, parametreY);
		System.out.println("la multiplication = " + res);
	}

	public static void exercice4() {
		System.out.println("*************************************");
		System.out.println("Maximum deux entier : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.max(parametreX, parametreY);
		System.out.println("le plus grand nombre = " + res);
	}

	public static void exercice5() {
		System.out.println("*************************************");
		System.out.println("Signe d'un entier : ");
		int parametreX = Clavier.lireInt();
		char res = Calculatrice.signe(parametreX);
		System.out.println("le signe = " + res);
	}

	public static void exercice6() {
		System.out.println("*************************************");
		System.out.println("Somme tableau de 5 elements : ");
		int[] tabInt = Clavier.lireTableauInt(5);
		int res = CalculatriceTableau.sommeElements(tabInt);
		System.out.println("la somme = " + res);
	}

	public static void exercice7() {
		System.out.println("*************************************");
		System.out.println("Plus petit element d'un tableau de 5 elements : ");
		int[] tabInt = Clavier.lireTableauInt(5);
		int res = CalculatriceTableau.plusPetitElement(tabInt);
		System.out.println("Plus petit element = " + res);
	}

	public static void exercice8() {
		System.out.println("*************************************");
		System.out.println("Somme de tous les élémens de 2 tableaux de 5 entiers : ");
		System.out.println("*** Premier tableau");
		int[] tabInt = Clavier.lireTableauInt(5);
		System.out.println("*** Deuxieme tableau");
		int[] tabInt2 = Clavier.lireTableauInt(5);
		long res = CalculatriceTableau.sommeElementsDeuxTableaux(tabInt, tabInt2);
		System.out.println("la somme = " + res);
	}

//	public static void exercice9() {
//		System.out.println("*************************************");
//		System.out.println("Tri ascendant d'un tableau de 5 elements : ");
//		int[] tabInt = Clavier.lireTableauInt(5);
//		int[] res = CalculatriceTableau.triAscendant(tabInt);
//		System.out.println("le tableau trié = " + Clavier.contenuTableau(res));
//	}

	public static void exercice10() {
		System.out.println("*************************************");
		System.out.println("Factorielle d'un entier : ");
		int parametreX = Clavier.lireInt();
		long res = Calculatrice.factorielle(parametreX);
		System.out.println("factorielle = " + res);
	}

	public static void exercice11() {
		System.out.println("*************************************");
		System.out.println("Conjonction (le and logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean boolB = Clavier.lireBoolean();
		boolean res = Calculatrice.conjonction(boolA, boolB);
		System.out.println("conjonction = " + res);
	}

	public static void exercice12() {
		System.out.println("*************************************");
		System.out.println("Disjonction (le ou logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean boolB = Clavier.lireBoolean();
		boolean res = Calculatrice.disjonction(boolA, boolB);
		System.out.println("disjontion = " + res);
	}

	public static void exercice13() {
		System.out.println("*************************************");
		System.out.println("Negation (le non logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean res = Calculatrice.negation(boolA);
		System.out.println("négation = " + res);
	}

	public static void exercice14() {
		System.out.println("*************************************");
		System.out.println("Conjonction d'un tableau de 5 elements boolean ");
		boolean[] tabBool = Clavier.lireTableauBoolean(5);
		System.out.println("conjonction = " + CalculatriceTableau.conjonction(tabBool));
	}

//	public static void exercice15() {
//		System.out.println("*************************************");
//		System.out.println("Trier les élémens de 2 tableaux de 5 entiers : ");
//		System.out.println("*** Premier tableau");
//		int[] tabInt = Clavier.lireTableauInt(5);
//		System.out.println("*** Deuxieme tableau");
//		int[] tabInt2 = Clavier.lireTableauInt(5);
//		int[] res = CalculatriceTableau.triAscendantDeuxTableaux(tabInt, tabInt2);
//		System.out.println("tri des 2 tableaux = " + Clavier.contenuTableau(res));
//	}

	public static void exercice16() {
		System.out.println("*************************************");
		System.out.println("Rechercher le nombre d'element pair dans un tableau : ");
		int[] tab = Clavier.lireTableauInt(6);
		long res = CalculatriceTableau.nombreDElementsPair(tab);
		System.out.println("nombre d element pair = " + res);
	}

	public static void exercice17() {
		System.out.println("*************************************");
		System.out.println("Rechercher si un element existe ou pas : ");
		int[] tab = Clavier.lireTableauInt(4);
		System.out.println("Saisir l'element à chercher");
		int param = Clavier.lireInt();
		boolean res = CalculatriceTableau.chercheSiUnElementExiste(param, tab);
		System.out.println("L element existe ? = " + res);
	}

	public static void exercice18() {
		System.out.println("*************************************");
		System.out.println("Methode qui met 0 dans les cases à indice impair d'un tableau : ");
		int[] tab = Clavier.lireTableauInt(6);
		int[] res = CalculatriceTableau.mettreZeroDansLesCasesAIndicesImpair(tab);
		System.out.println("Le tableau = " + Clavier.contenuTableau(res));
	}

	// le décalage se fait vers la droite
	public static void exercice19() {
		System.out.println("*************************************");
		System.out.println("Methode qui decale les elements d un tableau d une case : ");
		int[] tab = Clavier.lireTableauInt(6);
		int[] res = CalculatriceTableau.decalerLesElementsTableauDUneCase(tab);
		System.out.println("Le tableau = " + Clavier.contenuTableau(res));
	}

	public static void exercice20() {
		System.out.println("*************************************");
		System.out.println("Methode qui inverse un mot saisi (abc --> cba) : ");
		String str = Clavier.lireString();
		String res = MotsUtils.inverser(str);
		System.out.println("l'inverse du mot " + str + " est " + res);
	}

	public static void exercice21() {
		System.out.println("*************************************");
		System.out.println("Methode qui retourne tous les caracteres communs entre 2 String : ");
		String str = Clavier.lireString();
		String str2 = Clavier.lireString();
		String res = MotsUtils.caracteresCommuns(str, str2);
		System.out.println("les caractere communs entre " + str + " et " + str2 + " sont " + res);
	}

	public static void exercice22() {
		System.out.println("*************************************");
		System.out.println("Methode qui vérifie si un mot est un palindrome : ");
		String str = Clavier.lireString();
		boolean res = MotsUtils.estUnPalindrome(str);
		if (res) {
			System.out.println("le mot " + str + " est un palindrome ");
		} else {
			System.out.println("le mot " + str + " n'est pas un palindrome ");
		}
	}

	public static void exercice25() {
		System.out.println("*************************************");
		System.out.println("Methode qui calcule la somme des chiffres contenus dans un mot 'a3ji2' --> 5 :");
		String str = Clavier.lireString();
		long res = MotsUtils.sommeChiffresDansMot(str);
		System.out.println("La somme des chiffres : " + res);
	}

	/**
	 * créer une methode qui prend en parametre un entier strictement positif et qui
	 * affiche ceci si parametre est 4 alors affiche 83 si parametre est 11 alors
	 * affiche 2210 si parametre est 23 alors affiche 4622
	 */
	public static void exercice28() {
		System.out.println("*************************************");
		System.out.println("methode qui prend en parametre un entier strictement positif et qui affiche :");
		int param = Clavier.lireInt();
		String res = MotsUtils.devinerAlgo(param);
		System.out.println("Le resultat pour " + param + " est : " + res);
	}

	public static void exercice27() {
		System.out.println("*************************************");
		System.out.println(" saisir un string composé de 0 et 1 :");
		String str = Clavier.lireString();
		int res = MotsUtils.valeurBin(str);
		System.out.println("Le resultat décimal est : " + res);

	}

	public static void exercice26() {
		System.out.println("*************************************");
		System.out.println("Methode qui calcule la somme des codes unicodes des caracteres du string  :");
		String str = Clavier.lireString();
		long res = MotsUtils.sommeUnicodes(str);
		System.out.println("La somme des unicodes : " + res);
	}

	/**
	 * créer une methode qui prend deux parametres de type entier strictement
	 * positif et qui affiche ceci si parametres sont 3 et 4 alors affiche 5*7*9*11;
	 * si parametres sont 11 et 1 alors affiche 13; si parametres sont 22 et 3 alors
	 * affiche 23*25*27
	 */
	public static void exercice29() {
		System.out.println("*************************************");
		System.out.println("une methode qui prend deux parametres de type entier strictement positif et qui affiche :");
		int param = Clavier.lireInt();
		int param2 = Clavier.lireInt();
		String res = MotsUtils.exercice29(param, param2);
		System.out.println("Le resultat pour " + param + " est : " + res);
	}

	public static void exercice30() {
		System.out.println("*************************************");
		System.out.println("une methode qui prend un parametre de type réel strictement positif et qui affiche :");
		String str = Clavier.lireString();
		String res = MotsUtils.exercice30(str);
		System.out.println("Le resultat pour " + str + " est : " + res);
	}

	public static void exercice31() {
		System.out.println("*************************************");
		System.out.println("saisir un string (lettres seulement) et qui affiche  ceci :\r\n"
				+ "si paramètre est 'iDp' alors affiche 9416\r\n" + "si paramètre est 'BaA' alors affiche 211\r\n"
				+ "si paramètre est 'AfPa' alors affiche 16161\r\n" + "si paramètre est 'Za' alors affiche 261 ");
		String str = Clavier.lireString();
		String res = MotsUtils.exercice31(str);
		System.out.println("Le resultat pour " + str + " est : " + res);
	}

	public static void exercice32() {

		System.out.println("*************************************");
		System.out.println("saisir 'une entrée alphanumérique non vide\r\n" + "et qui affiche ceci :\r\n"
				+ "si paramètre est aze3rt alors affiche azerrrt\r\n"
				+ "si paramètre est 2abc1f alors affiche aabcf\r\n" + "si paramètre est xE3 alors affiche xE\r\n"
				+ "si paramètre est a12b alors affiche abbbbbbbbbbbb\r\n"
				+ "si paramètre est e4Ry alors affiche eRRRRy");
		String str = Clavier.lireString();
		String res = MotsUtils.exercice32(str);
		System.out.println("Le resultat pour " + str + " est : " + res);
	}

	public static void exercice23() {
		System.out.println("*************************************");
		System.out.println("Methode qui affiche le nombre d'occurence des caracteres : ");
		String str = Clavier.lireString();
		System.out.println("les occurences des lettres dans le mot : " + str);
		MotsUtils.afficherNombreOccurence(str);
	}

	public static void exercice34() {
		System.out.println("*************************************");
		System.out.println("Methode demande de saisir un entier et affiche un nombre aléatoire inférieur : ");
		int max = Clavier.lireInt();
		int alea = Calculatrice.aleatoireInferieur(max);
		System.out.println("Un nombre aléatoire inférieur à : " + max + " : " + alea);
	}

}
