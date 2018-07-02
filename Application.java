package com.StudentApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/** This class is executed to perform the function of searching
 * and sorting based on some criteria.
 * @author Rithika
 */
public class Application {
	/** This function is the main function that is executed that
	 * does the function of searching and sorting student data.
	 * @param args **Command line arguments in java are stored as string**
	 */
	public static void main(final String[] args) {
		List<Student> studentsData = new ArrayList<Student>();
		//Read student data from file using method.
		studentsData = readDataFromFile("C:\\Users\\Rithika\\Desktop\\studentInfo.csv");
		//Displaying user the coices and reading them.
		System.out.println("Welcome to student application for searching and sorting");
		System.out.print("1:Search\t2:Sort\nEnter your choice of function:");
		Scanner scanner = new Scanner(System.in);
		int functionChoice = scanner.nextInt();
		/*Flag is used to check if the record that is being searched is
		 * found in the data or not.
		 */
		int flag = 0;
		//if user selects to search from the data.
		if (functionChoice == 1) {
			//Display and read criteria for search.
			System.out.print("Choices for search criteria\n1:Id\n"
					+ "2:First Name\n3:Last Name\n4:Department name\n5:Class number\n"
					+ "Enter your choice:");
			int criteriaChoice = scanner.nextInt();
			switch (criteriaChoice) {
			    //search based on id number.Searching based on id number and displaying data.
				case 1: System.out.print("Enter ID number:");
				int id = scanner.nextInt();
				for (Student s : studentsData) {
				if (s.getIdNumber() == id) {
						System.out.println("Id number:" + s.getIdNumber() + " First name:"
						+ s.getFirstName() + " Last name:" + s.getLastName() + " Department name:"
							+ s.getDepartmentName() + " Class:" + s.getClassNumber());
						flag = 1;
					}
				}
				break;
				//search based on First name.Searching based on first name and displaying data.
				case 2: System.out.print("Enter First name:");
				String firstName = scanner.next();
				for (Student s : studentsData) {
					if (s.getFirstName().equals(firstName)) {
						System.out.println("Id number:" + s.getIdNumber() + " First name:"
					      + s.getFirstName() + " Last name:" + s.getLastName() + " Department name:"
							+ s.getDepartmentName() + " Class:" + s.getClassNumber());
						flag = 1;
					}
				}
				break;
				//search based on Last name.Searching based on last name and displaying data.
				case 3: System.out.print("Enter Last name:");
				String lastName = scanner.next();
				for (Student s : studentsData) {
					if (s.getLastName().equals(lastName)) {
						System.out.println("Id number:" + s.getIdNumber() + " First name:"
					      + s.getFirstName() + " Last name:" + s.getLastName() + " Department name:"
							+ s.getDepartmentName() + " Class:" + s.getClassNumber());
						flag = 1;
					}
				}
				break;
				//search based on Department name.Searching based on department name and displaying data.
				case 4: System.out.print("Enter department name:");
				String departmentName = scanner.next();
				for (Student s : studentsData) {
					if (s.getDepartmentName().equals(departmentName)) {
						System.out.println("Id number:" + s.getIdNumber() + " First name:"
					      + s.getFirstName() + " Last name:" + s.getLastName() + " Department name:"
							+ s.getDepartmentName() + " Class:" + s.getClassNumber());
						flag = 1;
					}
				}
				break;
				//search based on Class number.Searching based on class name and displaying data.
				case 5: System.out.print("Enter class number:");
				int classNumber = scanner.nextInt();
				for (Student s : studentsData) {
				if (s.getClassNumber() == classNumber) {
					System.out.println("Id number:" + s.getIdNumber() + " First name:"
				      + s.getFirstName() + " Last name:" + s.getLastName() + " Department name:"
						+ s.getDepartmentName() + " Class:" + s.getClassNumber());
					flag = 1;
					}
				}
				break;
				//default case when the user enters an invalid choice.
				default : System.out.println("Invalid choice!");
				break;
			}
			// Flag is not set if the record is not found.
			if (flag == 0) {
				//Display to the user the status if the record is not found.
				System.out.println("Record not found!");
			}
		} else if (functionChoice == 2) { //If the user selects to sort data.
			//Displaying the choices for sort criteria and reading them.
			System.out.print("Choices for search criteria\n1:Id\n"
					+ "2:First Name\n3:Last Name\n4:Department name\n5:Class number\n"
					+ "Enter your choice:");
			int criteriaChoice = scanner.nextInt();
			switch (criteriaChoice) {
			//Sort data based on Id number and store it in arraylist.
			case 1: Collections.sort(studentsData, new Comparator<Student>() {
				public int compare(final Student s1, final Student s2) {
					return Integer.compare(s1.getIdNumber(), s2.getIdNumber());
				}
			});
			break;
			//Sort data based on First name and store it in arraylist.
			case 2: Collections.sort(studentsData, new Comparator<Student>() {
				public int compare(final Student s1, final Student s2) {
					return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
				}
			});
			break;
			//Sort data based on Last name and store it in arraylist.
			case 3: Collections.sort(studentsData, new Comparator<Student>() {
				public int compare(final Student s1, final Student s2) {
					return s1.getLastName().compareToIgnoreCase(s2.getLastName());
				}
			});
			break;
			//Sort data based on Department name and store it in arraylist.
			case 4: Collections.sort(studentsData, new Comparator<Student>() {
				public int compare(final Student s1, final Student s2) {
					return s1.getDepartmentName().compareToIgnoreCase(s2.getDepartmentName());
				}
			});
			break;
			//Sort data based on Class number and store it in arraylist.
			case 5: Collections.sort(studentsData, new Comparator<Student>() {
				public int compare(final Student s1, final Student s2) {
					return Integer.compare(s1.getClassNumber(), s2.getClassNumber());
				}
			});
			break;
			//If the user enters an invalid choice.
			default: System.out.println("Invalid choice!");
			break;
			}
			//Display the data from the sorted arraylist.
			System.out.println("Id number\tFirst name\tLast name\tDepartment name\tClass number");
			for (Student s : studentsData) {
				System.out.println(s.getIdNumber() + "\t\t"
					      + s.getFirstName() + "\t\t" + s.getLastName() + "\t\t"
							+ s.getDepartmentName() + "\t\t" + s.getClassNumber());
			}
		}
		scanner.close();
	}
	/** This method reads the data from the file and stores the
	 * data from the file in an arraylist.
	 * @param fileName **This is the name of the filename to be read **
	 * @return ** Student data read is returned in the form of a list **
	 */
	private static List<Student> readDataFromFile(final String fileName) {
		List<Student> studentsData = new ArrayList<Student>();
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String currentLine;
			//Read data from the file and store it in arraylist.
			while ((currentLine = bufferedReader.readLine()) != null) {
				String[] data = currentLine.split(",");
				/*Send the strings of data read from the file to the setStudentData
				function so the data is set to student objects and is returned.*/
				Student student = setStudentData(data);
				//add the student objects to the arraylist.
				studentsData.add(student);
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentsData;
	}
	/** This method is to set student data to student object
	 * after retrieving data from the file.
	 * @param data ** This parameter stores the data retrieved from  file**
	 * @return Student
	 */
	private static Student setStudentData(final String[] data) {
		String firstName = data[0];
		String lastName = data[1];
		int idNumber = Integer.parseInt(data[2]);
		int classNumber = Integer.parseInt(data[3]);
		String departmentName = data[4];
		//Create Student object with student data and return it.
		return new Student(idNumber, firstName, lastName,
				departmentName, classNumber);
	}
}