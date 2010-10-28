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
