package gti310.tp3;

import java.util.List;

import gti310.tp3.parser.ConcreteParser;
import gti310.tp3.solver.ConcreteSolver;

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
		PathList list = new ConcreteSolver().solve(new ConcreteParser().parse("Musee.txt"));
		for (int i=0;i<list.pathCount();i++)
		{
			List<Integer> path = list.getPath(i);
			for (int j=0;j<path.size();j++)
				System.out.print(path.get(j)+" -> ");
			System.out.println();
		}
	}
}
