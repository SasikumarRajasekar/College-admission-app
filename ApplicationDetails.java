package caclass;

import java.util.Date;
import java.util.Objects;

public class ApplicationDetails {
	
    private int userId;
    private String studentName;
    private String fatherName;
    private Date DOB;
    private int aadharNumber;
    private int sslcMark;
    private int hscMark;
    private String address;
    private String city;
    private String userState;
    private String Nationality;
    private String Course;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public int getSslcMark() {
		return sslcMark;
	}
	public void setSslcMark(int sslcMark) {
		this.sslcMark = sslcMark;
	}
	public int getHscMark() {
		return hscMark;
	}
	public void setHscMark(int hscMark) {
		this.hscMark = hscMark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Course, DOB, Nationality, aadharNumber, address, city, fatherName, hscMark, sslcMark,
				studentName, userId, userState);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDetails other = (ApplicationDetails) obj;
		return Objects.equals(Course, other.Course) && Objects.equals(DOB, other.DOB)
				&& Objects.equals(Nationality, other.Nationality) && aadharNumber == other.aadharNumber
				&& Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(fatherName, other.fatherName) && hscMark == other.hscMark
				&& sslcMark == other.sslcMark && Objects.equals(studentName, other.studentName)
				&& userId == other.userId && Objects.equals(userState, other.userState);
	}
	@Override
	public String toString() {
		return "ApplicationDetails [userId=" + userId + ", studentName=" + studentName + ", fatherName=" + fatherName
				+ ", DOB=" + DOB + ", aadharNumber=" + aadharNumber + ", sslcMark=" + sslcMark + ", hscMark=" + hscMark
				+ ", address=" + address + ", city=" + city + ", userState=" + userState + ", Nationality="
				+ Nationality + ", Course=" + Course + "]";
	}
	public ApplicationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplicationDetails(int userId, String studentName, String fatherName, Date dOB, int aadharNumber,
			int sslcMark, int hscMark, String address, String city, String userState, String nationality,
			String course) {
		super();
		this.userId = userId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		DOB = dOB;
		this.aadharNumber = aadharNumber;
		this.sslcMark = sslcMark;
		this.hscMark = hscMark;
		this.address = address;
		this.city = city;
		this.userState = userState;
		Nationality = nationality;
		Course = course;
	}
    
    

}
