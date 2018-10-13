/**
 * Class for stock data.
 */
class StockData implements Comparable<StockData> {
	private String name;
	private float perchange;

	/**
	 * Constructs the object.
	 *
	 * @param      name       The name
	 * @param      perchange  The perchange
	 */
	StockData(String name, float perchange) {
		this.name = name;
		this.perchange = perchange;
	}

	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public String getname() {
		return name;
	}

	/**
	 * { function_description }
	 *
	 * @param      name  The name
	 */
	public void setname(String name) {
		this.name = name;
	}

	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public float getperchange() {
		return perchange;
	}

	/**
	 * { function_description }
	 *
	 * @param      perchange  The perchange
	 */
	public void setperchange(float perchange) {
		this.perchange = perchange;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String str = "";
		str = str + this.name + " " + this.perchange;
		return str;
	}

	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(StockData other) {
		if (this.perchange > other.perchange) return 1;
		if (this.perchange < other.perchange) return -1;
		if (this.name.compareTo(other.name) > 0) return 1;
		if (this.name.compareTo(other.name) < 0) return -1;
		return 0;
	}

	
}
