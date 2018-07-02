package com.StudentApp;
/** The class Student is a prototype for all the students.
 * @author Rithika
 */
public class Student {
	/**The string variable firstName is the first name of student.
	* The string variable lastName is the last name of student.
	* The string variable departmentName is the department name of student.
	*/
	private String firstName, lastName, departmentName;
	/** The integer variable idNumber is the id number of student.
	 * The integer variable classNumber is the class number of student.
	 */
	private int idNumber, classNumber;
	/** This is a constructor to initialize the values of a student object.
	 * @param idNumber ** This is id number of a student **
	 * @param firstName ** This is first name of a student **
	 * @param lastName ** This is last name of a student **
	 * @param departmentName ** This is department name of a student **
	 * @param classNumber ** This is class number of a student **
	 */
	public Student(int idNumber, String firstName, String lastName,
			String departmentName, int classNumber) {
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.classNumber = classNumber;
	}
	/** This method returns the id number of the student.
	 * @return **id number of the student**
	 */
	public int getIdNumber() {
		return idNumber;
	}
	/** This method returns the first name of the student.
	 * @return ** first name of the student **
	 */
	public String getFirstName() {
		return firstName;
	}
	/** This method returns the last name of the student.
	 * @return **last name of the student**
	 */
	public String getLastName() {
		return lastName;
	}
	/** This method returns the department name of the student.
	 * @return **department name of the student**
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/** This method returns the class number of the student.
	 * @return **class number of the student**
	 */
	public int getClassNumber() {
		return classNumber;
	}
}
