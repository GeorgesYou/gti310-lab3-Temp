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
	
	@Override
	public PathList solve(Data input) 
	{
		// TODO Auto-generated method stub
		links = input.getLinks();
		start = input.getDepart();
		
		nodeDone = new boolean[input.getNbSommet()];
		for (int i=0;i<nodeDone.length;i++)
			nodeDone[i]=false;
		
		redudancy(input, input.getDepart(), new LinkedList<Integer>());
		
		return list;
	}
	
	private void redudancy(Data data, int node, List<Integer> path)
	{
		nodeDone[node-1] = true;
		path.add(node);		
		
		for (int i=0;i<links.length;i++)
		{
			if (links[i][0]==node && !nodeDone[links[i][1]-1])
				redudancy(data,links[i][1], path);
			
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
