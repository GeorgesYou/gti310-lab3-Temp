/******************************************************
 Laboratoire #3 : Résolution de graphe
 
 Cours :             GTI310
 Session :           Automne 2010
 Groupe :            01
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Marie-Ève Benoit
 Code(s) perm. :     DESG24078908
 					 BENM22568707
 Chargée de lab. :   Jean-François Franche 
 Nom du fichier :    ConcreteWriter.java
 Date crée :         2010-11-09
 Date dern. modif.   2010-11-09
 *******************************************************/
package gti310.tp3.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import gti310.tp3.PathList;

public class ConcreteWriter implements Writer<PathList> {
	
	@Override
	public void write(String filename, PathList output) {
		// TODO Auto-generated method stub
		BufferedWriter writer = null;
		try 
		{
			writer = new BufferedWriter(new FileWriter(new File(filename)));
			for (int i=0;i<output.pathCount();i++)
			{
				List<Integer> path = output.getPath(i);
				for (int j=0;j<path.size()-1;j++)
					writer.write(path.get(j)+" ");
				writer.write(path.get(path.size()-1)+"\n");
			}
			writer.close();
		} 
		catch (Exception e) {e.printStackTrace();}
	}

}
