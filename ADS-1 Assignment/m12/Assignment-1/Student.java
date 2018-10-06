/**
 * Class for student.
 */
class Student implements Comparable<Student> {
	private String studentname;
	private String dateofbirth;
	private int subject1marks;
	private int subject2marks;
	private int subject3marks;
	private int totalmarks;
	private String category;

	/**
	 * Constructs the object.
	 *
	 * @param      studentname    The studentname
	 * @param      dateofbirth    The dateofbirth
	 * @param      subject1marks  The subject 1 marks
	 * @param      subject2marks  The subject 2 marks
	 * @param      subject3marks  The subject 3 marks
	 * @param      totalmarks     The totalmarks
	 * @param      category       The category
	 */
	Student(String studentname, String dateofbirth, int subject1marks,
	 int subject2marks, int subject3marks, int totalmarks, String category) {
	 	this.studentname = studentname;
	 	this.dateofbirth = dateofbirth;
	 	this.subject1marks = subject1marks;
	 	this.subject2marks = subject2marks;
	 	this.subject3marks = subject3marks;
	 	this.totalmarks = totalmarks;
	 	this.category = category;
	}

	/**
	 * Gets the student name.
	 *
	 * @return     The student name.
	 */
	public String getStudentName() {
		return studentname;
	}

	/**
	 * Sets the student name.
	 *
	 * @param      studentname  The studentname
	 */
	public void setStudentName(String studentname) {
		this.studentname = studentname;
	}

	/**
	 * Gets the dateof birth.
	 *
	 * @return     The dateof birth.
	 */
	public String getDateofBirth() {
		return dateofbirth;
	}

	/**
	 * Sets the dateof birth.
	 *
	 * @param      dateofbirth  The dateofbirth
	 */
	public void setDateofBirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * Gets the subject 1 marks.
	 *
	 * @return     The subject 1 marks.
	 */
	public int getSubject1Marks() {
		return subject1marks;
	}

	/**
	 * Sets the subject 1 marks.
	 *
	 * @param      subject1marks  The subject 1 marks
	 */
	public void setSubject1Marks(int subject1marks) {
		this.subject1marks = subject1marks;
	}

	/**
	 * Gets the subject 2 marks.
	 *
	 * @return     The subject 2 marks.
	 */
	public int getSubject2Marks() {
		return subject2marks;
	}

	/**
	 * Sets the subject 2 marks.
	 *
	 * @param      subject2marks  The subject 2 marks
	 */
	public void setSubject2Marks(int subject2marks) {
		this.subject2marks = subject2marks;
	}

	/**
	 * Gets the subject 3 marks.
	 *
	 * @return     The subject 3 marks.
	 */
	public int getSubject3Marks() {
		return subject3marks;
	}

	/**
	 * Sets the subject 3 marks.
	 *
	 * @param      subject3marks  The subject 3 marks
	 */
	public void setSubject3Marks(int subject3marks) {
		this.subject3marks = subject3marks;
	}

	/**
	 * Gets the total marks.
	 *
	 * @return     The total marks.
	 */
	public int getTotalMarks() {
		return totalmarks;
	}

	/**
	 * Sets the total marks.
	 */
	public void setTotalMarks() {
		this.totalmarks = totalmarks;
	}

	/**
	 * Gets the category.
	 *
	 * @return     The category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param      category  The category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(Student that) {
		if(this.subject1marks > that.subject1marks) return 1;
		if(this.subject1marks < that.subject1marks) return -1;
		if(this.subject2marks > that.subject2marks) return 1;
		if(this.subject2marks < that.subject2marks) return -1;
		if(this.subject3marks > that.subject3marks) return 1;
		if(this.subject3marks < that.subject3marks) return -1;
		if(this.totalmarks > that.totalmarks) return 1;
		if(this.totalmarks < that.totalmarks) return -1;
		return  0;
	}	
 }
