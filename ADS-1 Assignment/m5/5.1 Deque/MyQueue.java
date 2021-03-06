public class MyQueue<E> {
	int size = 0;
	private class Node {
		E data;
		Node next;
		Node () {}
		Node (E data) {
			this(data, null);
		}
		Node (E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node head;
	private Node tail;

	public void pushLeft(E data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		if (head == null) {
			head = node;
			tail = head;
			size++;
			return;
		}
		head = node;
		size++;
	}

	public void pushRight(E data) {
		tail.next = new Node(data);
		tail = tail.next;
		size++;
	}

	public E popLeft() {
		E data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public E popRight() {
		E data = tail.data;
		Node thead = head;
		while (thead.next != tail) {
			thead = thead.next;
			// size--;
		}
		thead.next = null;
		tail = thead;
		size--;
		return data;
	}

	public int size() {
		return size;
	}
	public String toString() {
		String str = "[";
		Node thead = head;
		if (thead != null) {
			while (thead.next != null) {
				str += thead.data + ", ";
				thead = thead.next;
			}
			str += thead.data;

		}
		str += "]";
		return str;

	}

}
