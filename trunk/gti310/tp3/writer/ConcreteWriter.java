package gti310.tp3.writer;

import java.util.List;

import gti310.tp3.PathList;

public class ConcreteWriter implements Writer<PathList> {
	
	@Override
	public void write(String filename, PathList output) {
		// TODO Auto-generated method stub
		for (int i=0;i<output.pathCount();i++)
		{
			List<Integer> path = output.getPath(i);
			for (int j=0;j<path.size();j++)
				System.out.print(path.get(j)+" -> ");
			System.out.println();
		}
	}

}
