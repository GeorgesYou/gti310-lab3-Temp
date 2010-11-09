/******************************************************
 Laboratoire #3 : Résolution de graph
 
 Cours :             GTI310
 Session :           Automne 2010
 Groupe :            01
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Marie-Ève Benoit
 Code(s) perm. :     DESG24078908
 					 BENM22568707
 Chargée de lab. :   Jean-François Franche 
 Nom du fichier :    PathList.java
 Date crée :         2010-11-09
 Date dern. modif.   2010-11-09
 *******************************************************/
package gti310.tp3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathList {

	List<List<Integer>> list = new ArrayList<List<Integer>>();
	
	public void addPath(List<Integer> path)
	{
		list.add(new LinkedList<Integer>(path));
	}
	
	public List<Integer> getPath(int index)
	{
		return list.get(index);
	}
	
	public int pathCount()
	{
		return list.size();
	}
}
