/**
 * List of linkeds.
 */
class LinkedList {
    Node start = null;
    int size = 0;

    /**
     * Class for node.
     */
    class Node {
        String data;
        Node link;

        /**
         * Gets the data.
         *
         * @return     The data.
         */
        public String getData() {
            return this.data;
        }

        /**
         * Gets the link.
         *
         * @return     The link.
         */
        public Node getLink() {
            return this.link;
        }

        /**
         * Sets the data.
         */
        public void setData(String data) {
            this.data = data;
        }

        /**
         * Sets the link.
         */
        public void setLink(Node link) {
            this.link = link;
        }
    }

    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return start == null;
    }

    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }

    /**
     * { function_description }.
     *
     * @param      data  The data
     */
    public void push(final String data) {
        Node temp = start;
        start = new Node();
        start.data = data;
        start.link = temp;
        size++;
    }

    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String pop() {
        String data = start.data;
        start = start.link;
        size--;
        return data;
    }

    /**
     * Gets the start.
     *
     * @return     The start.
     */
    public Node getStart() {
        return start;
    }
}


