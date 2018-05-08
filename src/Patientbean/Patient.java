package Patientbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Patient implements Serializable // Bean class whose objects are written to file
{
	int PatientId;
	String name;
	String address;
	int age;
	String bloodGroup;
	String disease;
	String gender;
	int phoneNumber;
	String symptoms;
	String medicines;
	String consultedDoctor;
	int DoctorId;

	public Patient() {
	}

	public Patient(int patientId, String name, String address, int age, String bloodGroup, String disease,
			String gender, int phoneNumber, String symptoms, String medicines, String consultedDoctor, int doctorId) {
		super();
		PatientId = patientId;
		this.name = name;
		this.address = address;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.disease = disease;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.symptoms = symptoms;
		this.medicines = medicines;
		this.consultedDoctor = consultedDoctor;
		DoctorId = doctorId;
	}

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public String getConsultedDoctor() {
		return consultedDoctor;
	}

	public void setConsultedDoctor(String consultedDoctor) {
		this.consultedDoctor = consultedDoctor;
	}

	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}

}