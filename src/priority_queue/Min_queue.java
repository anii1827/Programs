package priority_queue;

public class Min_queue implements priority_queue {
	private int array [];
	static int current_position;
	
	public Min_queue(int size) {
			super();
			array = new int[size];
			current_position=0;
	}
	
	public void swap(int x, int y) {
		int temp = array[x];
		array[x]=array[y];
		array[y]=temp;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int poll() {
		int temp_position = current_position-1;
		swap(0,temp_position);
		array[temp_position]=-1;
		removeheapify();
		current_position--;
		return 0;
	}

	@Override
	public int get() {
		return array[0];
	}

	@Override
	public void insert(int Element) {
		if(current_position==array.length) {
			System.out.println("No Space Left");
			return;
		}
		else {
			array[current_position]=Element;
			heapify();
			current_position++;
		}
	}

	@Override
	public void heapify() {
		int tempreary_current = current_position;
		int parentNode = (tempreary_current-1)/2;
		 while(parentNode>=0 && array[parentNode]>array[tempreary_current]) {
			 swap(parentNode, tempreary_current);
			 tempreary_current=parentNode;
			 parentNode=(tempreary_current-1)/2;
		 }
	}
	public void removeheapify() {
		int parent = 0, left=1, right=2;
		while((parent<=array.length && left<=array.length && right<=array.length) && (array[parent]>array[left] || array[parent]>array[right])) {
			if(array[parent]==-1 || array[left]==-1 || array[right]==-1) {
				break;
			}
			if(array[parent]>array[left] && array[parent]>array[right]) {
				int temp = compare(left, right);
				swap(temp,parent);
				parent=temp;
			}
			else if (array[parent]>array[left]) {
				swap(parent, left);
				parent=left;
			}
			else {
				swap(parent,right);
				parent=right;
			}
			left=(2*parent)+1;
			right=(2*parent)+2;
		}
	}

	@Override
	public int[] getArray() {
		return array;
	}
	
	public int compare(int left, int right) {
		if(array[left]<array[right]) {
			return left;
		}
		else return right;
	}

}
