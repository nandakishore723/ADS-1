/**
 * Class for node.
 */
class Node {
	private int data;
	private Node nextNode;

	/**
	 * Constructs the object.
	 *
	 * @param      data  The data
	 */
	Node(int data) {
		this.data = data;
		this.nextNode = null;
	}

	/**
	 * Gets the data.
	 *
	 * @return     The data.
	 */
	public int getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param      data  The data
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Gets the next node.
	 *
	 * @return     The next node.
	 */
	public Node getNextNode() {
		return nextNode;
	}

	/**
	 * Sets the next node.
	 *
	 * @param      nextNode  The next node
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}	
}
