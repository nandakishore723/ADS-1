class LinkedList {
	private int size;
	private Node start;
	LinkedList() {
		size = 0;
		start = null;
	}

	public int size() {
		return size;
	}

	public void pushRight(int data) {
		if (start == null) {
			Node newnode = new Node(data);
			start = newnode;
		} else {
			Node a = new Node(data);
			Node temp = start;
			while (temp.getLink() != null) {
				temp = temp.getLink();
			}
			temp.setLink(a);
		}
		size++;
	}

	public void pushLeft(int data) {
		Node newnode = new Node(data);
		newnode.setLink(start);
		start = newnode;
		size++;
	}

	public  void popLeft() {
		if (start != null) {
			start = start.getLink();
		}
		size--;

	}

	public void popRight() {
		Node temp = start;

		if (start == null) {
			System.out.println("Node is Empty");;
		} else if (size < 2) {
			start = null;
		} else {
			while (temp.getLink().getLink() != null) {
				temp = temp.getLink();
			}
			temp.setLink(null);
		}
		size--;
	}

	public void remove(int item) {
		Node temp1 = start;
		while (temp1 != null) {
			if (temp1.getData() == item) {
				temp1.setLink(null);
			}
		}
	}

	public String toString() {
		String str = "";
		Node temp = start;
		if (temp == null) {
			return "Empty linked list";
		}
		while (temp != null) {
			str = str  + temp.getData() + ", ";
			temp = temp.getLink();
		}
		return str;
	}
}

