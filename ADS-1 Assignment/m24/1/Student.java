/**
 * Class for student.
 */
class Student {
	private String studentname;
	private double totalmarks;

	/**
	 * Constructs the object.
	 *
	 * @param      studentname  The studentname
	 * @param      totalmarks   The totalmarks
	 */
	Student(String studentname, double totalmarks) {
		this.studentname = studentname;
		this.totalmarks = totalmarks;
	}

	/**
	 * Gets the studentname.
	 *
	 * @return     The studentname.
	 */
	public String getstudentname() {
		return studentname;
	}

	/**
	 * Sets the studentname.
	 *
	 * @param      studentname  The studentname
	 */
	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}

	/**
	 * Gets the totalmarks.
	 *
	 * @return     The totalmarks.
	 */
	public double gettotalmarks() {
		return totalmarks;
	}

	/**
	 * sets the totalmarks.
	 *
	 * @param      totalmarks  The totalmarks
	 */
	public void settotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String str = "";
		str = str + this.studentname + this.totalmarks;
		return str;
	}
}
