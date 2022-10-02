public final class TabAlgos {
/** @return valeur la plus grande d'un tableau. */
public static int plusGrand(final int[] tab) {
	int temp = tab[0];
	for(int i = 1; i < tab.length; i++)
	{
		if(tab[i] > temp)
		{
			temp = tab[i];
		}
	}
	return temp;

}
/**
* @return moyenne des valeurs du tableau.
* @throw IllegalArgumentException si tab et null ou vide.
**/
public static double moyenne(final int[] tab) {

	int somme =0;
	for(int i = 0; i < tab.length; i++)
	{
		somme += tab[i];
	}
	return ((double)somme/tab.length);

}
/** Compare le contenu de 2 tableaux en tenant compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
* avec les mêmes nombres d'occurences (avec les elements dans le meme ordre).
**/
public static boolean egaux(final int[] tab1,final int[] tab2) {
	if(tab1.length != tab2.length)
	{
		return false;
	}
	for(int i = 0; i < tab1.length; i++)
	{
		if(tab1[i] != tab2[i])
		{
			return false;
		}
	}
	return true;
}
/** Méthode permettant de compter le nombre d'occurences d'un éléments dans un tableau
*@return le nombre d'occurences de cet éléments
**/
public static double nbrOccurence(final int[] tab, int n) {
	int nbr = 0;
	for(int i = 0; i < tab.length; i++)
	{
		if(n == tab[i])
		{
			nbr++;
		}
	}
	return nbr;

}
/** Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
* avec les mêmes nombres d'occurrence (pas forcément dans le meme ordre).
**/
public static boolean similaires(final int[] tab1,final int[] tab2) {
	if(tab1.length != tab2.length)
	{
		return false;
	}
	for(int i = 0; i < tab1.length; i++)
	{
		if(nbrOccurence(tab1[], tab1[i]) != nbrOccurence(tab2[], tab1[i]))
		{
			return false;
		}
	}
	return true;
	
}
}
