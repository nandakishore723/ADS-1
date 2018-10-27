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
     * @param      rollnumber   The rollnumber
     * @param      studentname  The studentname
     * @param      totalmarks   The totalmarks
     */
    Student(int rollnumber, String studentname, double totalmarks) {
        this.rollnumber = rollnumber;
        this.studentname = studentname;
        this.totalmarks = totalmarks;
    }
    /**
     * . Constructs the object.
     *
     * @param      studentname  The studentname
     * @param      totalmarks   The totalmarks
     */
    Student(String studentname, double totalmarks) {
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
    public void setrollno( int rollnumber) {
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
