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
