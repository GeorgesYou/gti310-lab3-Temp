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
 Nom du fichier :    Application.java
 Date crée :         2010-11-09
 Date dern. modif.   2010-11-09
 *******************************************************/
package gti310.tp3;

import java.util.List;

import gti310.tp3.parser.ConcreteParser;
import gti310.tp3.solver.ConcreteSolver;
import gti310.tp3.writer.ConcreteWriter;

/**
 * The Application class defines a template method to call the elements to
 * solve the problem Unreal-Networks is façing.
 * 
 * @author François Caron <francois.caron.7@ens.etsmtl.ca>
 */
public class Application {

	/**
	 * The Application's entry point.
	 * 
	 * The main method makes a series of calls to find a solution to the
	 * problem. The program awaits two arguments, the complete path to the
	 * input file, and the complete path to the output file.
	 * 
	 * @param args The array containing the arguments to the files.
	 */
	public static void main(String args[]) {
		//args = new String[]{"Musee.txt","Sol-Musee.txt"};
		if (args.length==2)
			new ConcreteWriter().write(args[1], new ConcreteSolver().solve(new ConcreteParser().parse(args[0])));
		else
			System.out.println("Please enter the 2 files name");
	}
}
