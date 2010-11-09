/******************************************************
 Laboratoire #3 : R�solution de graphe
 
 Cours :             GTI310
 Session :           Automne 2010
 Groupe :            01
 Projet :            Laboratoire #3
 �tudiant(e)(s) :    Gabriel Desmarais
 					 Marie-�ve Benoit
 Code(s) perm. :     DESG24078908
 					 BENM22568707
 Charg�e de lab. :   Jean-Fran�ois Franche 
 Nom du fichier :    Data.java
 Date cr�e :         2010-11-09
 Date dern. modif.   2010-11-09
 *******************************************************/
package gti310.tp3;

public class Data {

	private int nbSommet = 0;
	private int valInf = 0;
	private int depart = 0;
	private int[][] links = null;
	
	public Data(int nbSommet, int valInf, int depart, int[][] links)
	{
		this.nbSommet = nbSommet;
		this.valInf = valInf;
		this.depart = depart;
		this.links = links;
	}
	
	/**
	 * @return the nbSommet
	 */
	public int getNbSommet() {
		return nbSommet;
	}
	
	/**
	 * @return the nbSommet
	 */
	public int getValInf() {
		return valInf;
	}
	
	/**
	 * @return the nbSommet
	 */
	public int getDepart() {
		return depart;
	}
	
	/**
	 * @return the nbSommet
	 */
	public int[][] getLinks() {
		return links;
	}
}
