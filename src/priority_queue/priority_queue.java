package priority_queue;

public interface priority_queue{
		public boolean isEmpty();
		public int size();
		public int poll();
		public int get();
		public void insert(int Element);
		public void heapify();
		public int[] getArray();
}
