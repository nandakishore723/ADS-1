/**.
 * Class for student.
 */
class Student {
    /**
     * rollnumber of student.
     */
    private int rollnumber;
    /**.
     * name of student.
     */
    private String studentname;
    /**.
     * totalmarks of student.
     */
    private double totalmarks;

    /**
     * Constructs the object.
     *
     * @param      rollnumber1   The rollnumber
     * @param      studentname1  The studentname
     * @param      totalmarks1   The totalmarks
     */
    Student(final int rollnumber1, final String studentname1, final double totalmarks1) {
        this.rollnumber = rollnumber1;
        this.studentname = studentname1;
        this.totalmarks = totalmarks1;
    }
    /**
     * . Constructs the object.
     *
     * @param      studentname  The studentname
     * @param      totalmarks   The totalmarks
     */
    Student(final String studentname, final double totalmarks) {
        this.studentname = studentname;
        this.totalmarks = totalmarks;
    }
    /**
     * Gets the rollnumber.
     *
     * @return     The rollnumber.
     */
    public int getrollnumber() {
        return rollnumber;
    }
    /**.
     * Sets the rollnumber.
     *
     * @param      rollno  The rollnumber.
     */
    public void setrollno(final int rollnumber) {
        this.rollnumber = rollnumber;
    }

    /**.
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
    public void setstudentname(final String studentname) {
        this.studentname = studentname;
    }
    /**
     * Gets the totalmarks.
     *
     * @return     The totalmarks.
     */
    public Double gettotalmarks() {
        return totalmarks;
    }
    /**
     * Sets the totalmarks.
     *
     * @param      totalmarks  The totalmarks
     */
    public void settotalmarks(final Double totalmarks) {
        this.totalmarks = totalmarks;
    }
}
