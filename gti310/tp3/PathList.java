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
