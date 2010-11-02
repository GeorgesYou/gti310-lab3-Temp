package gti310.tp3.solver;

import java.util.LinkedList;
import java.util.List;

import gti310.tp3.Data;
import gti310.tp3.PathList;

public class ConcreteSolver implements Solver<Data,PathList> {

	PathList list = new PathList();
	private boolean[] nodeDone = null;
	private int[][] links;
	int start = -1;
	
	/**
	 * c1+c2+c3+c4(n+1)+c5(n)+N^N+c7
	 * (c1+c2+c3+c4+c7)+(c4+c5)n+n^n
	 * k1+k2n+n^n
	 * n^n
	 *  
	 * L'appel de la fonction recursion à la ligne 6 vaut N^N, ce qui donne, à la fonction solve, la valeur de :
	 * O(N^N)
	 * 
	 * @param input
	 */
	@Override
	public PathList solve(Data input) 
	{
		// TODO Auto-generated method stub
		links = input.getLinks();
		start = input.getDepart();
		
		nodeDone = new boolean[input.getNbSommet()];
		for (int i=0;i<nodeDone.length;i++)
			nodeDone[i]=false;
		
		recursion(input, input.getDepart(), new LinkedList<Integer>()); //O(N^N)
		
		return list;
	}
	/** 
	 * À cause de la récursion de la ligne 5, la valeur de la fonction est de :
	 * O(N^N)
	 * 
	 * @param data
	 * @param node
	 * @param path
	 */
	private void recursion(Data data, int node, List<Integer> path)
	{
		nodeDone[node-1] = true;
		path.add(node);		
		
		for (int i=0;i<links.length;i++)
		{
			if (links[i][0]==node && !nodeDone[links[i][1]-1])
				recursion(data, links[i][1], path);
			
			if (links[i][0]==node && links[i][1]==start)
			{
				boolean winner=true;
				for (int j=0;j<nodeDone.length;j++)
					if (!nodeDone[j])
						winner=false;
				if (winner)
				{
					path.add(start);
					list.addPath(path);
					path.remove(new Integer(start));
				}
			}
		}
		
		path.remove(new Integer(node));
		nodeDone[node-1] = false;
	}
}
