package Binery;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;
import java.util.stream.Collectors;


public class VerticalOrderTraversal implements Traversal{
	LinkedHashMap<Integer, List<Integer>> table= new LinkedHashMap<>();
	Hashtable<Integer, Integer> priority = new Hashtable<>();
	Node root;
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	public VerticalOrderTraversal(BineryTree tree) {
		this.root=tree.getRoot();
		List<Integer> l = new ArrayList<>(); 
		table.keySet().stream().sorted().forEach(t->l.add(t));
	}
	
	@Override
	public ArrayList<Integer> traverse() {
		findTheHorizantalDistance(0, root);
		check();
		System.out.println();
		sort().stream().forEach(t->System.out.print(t+", "));
		return null;
	}
	
	public void findTheHorizantalDistance(int Hd, Node root) {
		if(root==null) {
			return;
		}
		max=Math.max(max, Hd);
		min=Math.min(min, Hd);
		fill(Hd,root);
		findTheHorizantalDistance(Hd-1, root.getLeft());
		findTheHorizantalDistance(Hd+1, root.getRight());
	}
	
	public void fill(int Hd, Node root) {
		if(table.containsKey(Hd)) {
			List<Integer> l = table.get(Hd);
			l.add(root.getData());
			table.replace(Hd, l);
		}
		else {
			List<Integer> l = new ArrayList<>();
			l.add(root.getData());
			table.put(Hd, l);
		}
	}
	
	public void check() {
		System.out.println(table);
//		System.out.println("Max = "+max);
//		System.out.println("min = " +min);
	}
	
	public ArrayList<Integer> sort() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int x=min;x<=max;x++) {
			for(Integer y : table.get(x)) {
				list.add(y);
			}
		}
		return list;
	}
	public void checking()
	{
		
	}
	
	public void test() {
		
	}
	
	
	
}
