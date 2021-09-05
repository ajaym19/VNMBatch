package Encapsulation;

public class StudentsDemo {

	/*
	 * AccessModifiers:
	 * private: visible only within the class
	 * protected: visible within the package and outside the package, child class can access
	 * default: visible within the package and outside the package, even child class cannot access
	 * public: accessible across the entire project
	 */
	
	private int id; //r-no, w-no
	private String studentName;
	private int rollNo;
	private int phoneNumber;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		//check the udpated value
		this.studentName = studentName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	
	

}
