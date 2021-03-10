package priority_queue;

public class driver {

	public static void main(String[] args) {
		priority_queue queue = new Min_queue(15);
		queue.insert(10);
		queue.insert(13);
		queue.insert(9);
		queue.insert(2);
		queue.insert(1);
		queue.insert(15);
		queue.insert(11);
		queue.insert(25);
		queue.insert(23);
		queue.insert(7);
		queue.insert(14);
		queue.insert(20);
		queue.insert(19);
		queue.insert(12);
		queue.insert(6);
		int arr [] = queue.getArray();
//		for(int x=0;x<arr.length;x++) {
//			System.out.println(x+" "+arr[x]);
//		}
		System.out.println("after remove top element");
		queue.poll();
		int arra [] = queue.getArray();
		for(int x=0;x<arra.length;x++) {
			if(arra[x]!=-1) {
			System.out.println(x+" "+arra[x]);
			}
		}
	}

}
