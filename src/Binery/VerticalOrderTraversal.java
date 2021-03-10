package Binery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class VerticalOrderTraversal implements Traversal{
	LinkedHashMap<Integer, List<Integer>> table= new LinkedHashMap<>();
	Queue<details> queue = new LinkedList<>();
	Node root;
	public VerticalOrderTraversal(BineryTree tree) {
		this.root=tree.getRoot();
		queue.add(new details(root,0));
		
	}
	
	@Override
	public ArrayList<Integer> traverse() {
		while(!queue.isEmpty()) {
			details d = queue.poll();
			Node temp = d.root;
			fill(d.HD, temp);
			if(temp.getLeft()!=null)queue.add(new details(temp.getLeft(),d.HD-1));
			if(temp.getRight()!=null)queue.add(new details(temp.getRight(),d.HD+1));
		}
		return result();
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
	
	public ArrayList<Integer> result(){
		List<Integer> list = new ArrayList<>(table.keySet());
		Collections.sort(list);
		ArrayList<Integer> result = new ArrayList<>();
		for(Integer x : list) {
			for(Integer y : table.get(x)) {
				result.add(y);
			}
		}
		return result;
	}
}

class details{
    Node root;
    int HD;
    details(Node root, int Hd){
        this.root=root;
        this.HD=Hd;
    }
}
