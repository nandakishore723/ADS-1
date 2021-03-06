/**
 * Class for deque.
 *
 * @param      <Item>  The item
 */
class Deque<Item> {
	Node first = null;
	Node last = null;
	int size = 0;
	String print = "";
	class Node {
		Item data;
		Node next;

		/**
		 * Constructs the object.
		 *
		 * @param      data  The data
		 */
		Node(Item data) {
			this.data=data;
		}
	}

	/**
	 * Determines if empty.
	 *
	 * @return     True if empty, False otherwise.
	 */
	public boolean isEmpty() {
		return size==0;
	}

	/**
	 * Gets the size.
	 *
	 * @return     The size.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * { function_description }.
	 *
	 * @param      element  The element
	 */
	public void push(Item element) {
		Node oldleft = last;
		last = new Node(element);
		if (isEmpty()) {
			first = last;
			last.next = first;
			size++;
			return;
		}
		last.next =first;
		oldleft.next =last;
		size++;
	}

	/**
	 * { function_description }.
	 *
	 * @param      person  The person
	 *
	 * @return     { description_of_the_return_value }
	 */
	public Item pop(Item person) {
		Item d = first.data;
		if (isEmpty()) {
			return null;
		}
		int s = 0;
		Node get = first;
		Node prev = null;
		while (s < size) {
			if (get.data == person) {
				if (first.data == person) {
					first = first.next;
					int g = 0;
					Node l = first;
					while (g < size - 2) {
						l = l.next;
						g++;
					}
					last = l;
					last.next = first;
				} else {
					prev.next = get.next;
				}
				size--;
				break;
			}
			prev = get;
			get = get.next;
			s++;
		}
		return d;
	}

	/**
	 * { function_description }.
	 *
	 * @param      people  The people
	 * @param      gap     The gap
	 */
	public void josephus(int people, int gap) {
		Node head = first;
		while (!isEmpty()) {
			int c = 0;
			while (c < gap - 1) {
				head = head.next;
				c++;
			}
			print += head.data + " ";
			pop(head.data);
			head = head.next;
		}
		print = print.trim();
		System.out.println(print);
	}

	/**
	 * { function_description }.
	 */
	public void printList() {
		Node n = first;
		Node tnode = first.next;
		String s = "";
		s += n.data + " ";
		while (tnode != first) {
			s += tnode.data + " ";
			tnode = tnode.next;
		}
		s = s.trim();
		System.out.println(s);
	}

}
