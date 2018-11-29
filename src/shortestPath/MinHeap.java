package shortestPath;

import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Node> list;

    public MinHeap() {

        this.list = new ArrayList<Node>();
    }
    
    public ArrayList<Node> getList(){
    	return list;
    }

    public MinHeap(ArrayList<Node> items) {

        this.list = items;
        buildHeap();
    }

    public void insert(Node item) {

        list.add(item);
        int i = list.size() - 1;
        int parent = parent(i);

        while (parent != i && list.get(i).getDistance() < list.get(parent).getDistance()) {

            swap(i, parent);
            i = parent;
            parent = parent(i);
        }
    }

    public void buildHeap() {

        for (int i = list.size() / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    public Node extractMin() {

        if (list.size() == 0) {

            throw new IllegalStateException("MinHeap is EMPTY");
        } else if (list.size() == 1) {

            Node min = list.remove(0);
            return min;
        }

        // remove the last item ,and set it as new root
        Node min = list.get(0);
        Node lastItem = list.remove(list.size() - 1);
        list.set(0, lastItem);

        // bubble-down until heap property is maintained
        minHeapify(0);

        // return min key
        return min;
    }


    private void minHeapify(int i) {

        int left = left(i);
        int right = right(i);
        int smallest = -1;
        
        System.out.println("Current: " + list.get(i) + ", ind: " + i + ", leftInd: " + left + 
        		", rightInd: " + right + "\n smallestInd: " + smallest + ", size: " + list.size());
        if (left < list.size()) {
        	System.out.println("Left: " + list.get(left));
        }
        if (right < list.size()) {
       	 	System.out.println("Right: " + list.get(right));
        }
        if (smallest < list.size() && smallest > 0) {
       	 	System.out.println("Smallest: " + list.get(smallest));
        }
        

        // find the smallest key between current node and its children.
        if (left <= list.size() - 1 && list.get(left).getDistance() < list.get(i).getDistance()) {
            smallest = left;
        } else {
            smallest = i;
        }

        if (right <= list.size() - 1 && list.get(right).getDistance() < list.get(smallest).getDistance()) {
            smallest = right;
        }

        // if the smallest key is not the current key then bubble-down it.
        if (smallest != i) {

            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    public Node getMin() {

        return list.get(0);
    }

    public boolean isEmpty() {

        return list.size() == 0;
    }

    private int right(int i) {

        return 2 * i + 2;
    }

    private int left(int i) {

        return 2 * i + 1;
    }

    private int parent(int i) {

        if (i % 2 == 1) {
            return i / 2;
        }

        return (i - 1) / 2;
    }

    private void swap(int i, int parent) {

        Node temp = list.get(parent);
        list.set(parent, list.get(i));
        list.set(i, temp);
    }
    
    @Override
    public String toString() {
    	String s = "";
    	for(Node n : list) {
    		s += n + " ";
    	}
    	return s;
    }
    
    public static void main(String[] args) {
    	ArrayList<Node> list = new ArrayList<>();
    	list.add(new Node('B', 1));
    	list.add(new Node('F', 5));
    	list.add(new Node('G', 6));
    	list.add(new Node('A', 0));
    	list.add(new Node('D', 3));
    	list.add(new Node('C', 2));
    	list.add(new Node('E', 4));
    	MinHeap mh = new MinHeap(list);
    	System.out.println("Before: " + mh);

		

	}

}
