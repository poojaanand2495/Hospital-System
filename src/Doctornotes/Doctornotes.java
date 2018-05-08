package Doctornotes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Doctornotes implements Serializable // Class whose objects are written to a file to store Doctor notes
{
	int doctorId;
	String doctorName;
	int patientId;
	String patientName;
	String doctorNotes;

	public Doctornotes() {
	}

	public Doctornotes(int doctorId, String doctorName, int patientId, String patientName, String doctorNotes) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorNotes = doctorNotes;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorNotes() {
		return doctorNotes;
	}

	public void setDoctorNotes(String doctorNotes) {
		this.doctorNotes = doctorNotes;
	}

}
