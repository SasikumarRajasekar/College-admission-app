package caclass;

import java.util.Objects;

public class FeesList {
	
	private int feesId;
	private int courseId;
	private int admissionFees;
	private int tuitionFees;
	private int examFees;
	public int getFeesId() {
		return feesId;
	}
	public void setFeesId(int feesId) {
		this.feesId = feesId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getAdmissionFees() {
		return admissionFees;
	}
	public void setAdmissionFees(int admissionFees) {
		this.admissionFees = admissionFees;
	}
	public int getTuitionFees() {
		return tuitionFees;
	}
	public void setTuitionFees(int tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	public int getExamFees() {
		return examFees;
	}
	public void setExamFees(int examFees) {
		this.examFees = examFees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(admissionFees, courseId, examFees, feesId, tuitionFees);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeesList other = (FeesList) obj;
		return admissionFees == other.admissionFees && courseId == other.courseId && examFees == other.examFees
				&& feesId == other.feesId && tuitionFees == other.tuitionFees;
	}
	public FeesList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeesList(int feesId, int courseId, int admissionFees, int tuitionFees, int examFees) {
		super();
		this.feesId = feesId;
		this.courseId = courseId;
		this.admissionFees = admissionFees;
		this.tuitionFees = tuitionFees;
		this.examFees = examFees;
	}
	
	

}
