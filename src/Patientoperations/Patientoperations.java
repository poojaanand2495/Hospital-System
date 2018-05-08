package Patientoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Doctornotes.Doctornotes;

import java.io.*;

import Patientbean.Patient;

public class Patientoperations // class to implement patient operations exclusively
{
	List<Patient> listOfPatient = new ArrayList<Patient>();
	List<Doctornotes> listOfNotes = new ArrayList<Doctornotes>();

	Scanner s = new Scanner(System.in);
	Scanner i = new Scanner(System.in);
	File file = new File("G:\\hospitalfiles\\Patient.txt");

	@SuppressWarnings("unchecked")
	public void viewPrescription(int id) {

		List<Patient> woi = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream("G:\\hospitalfiles\\Patient.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			woi = (ArrayList<Patient>) ois.readObject();
			for (int i = 0; i < woi.size(); i++)

			{
				if (id == woi.get(i).getPatientId()) {
					System.out.println("\n\n");
					System.out.println(woi.get(i).getPatientId());
					System.out.println(woi.get(i).getName());
					System.out.println(woi.get(i).getMedicines());
					System.out.println(woi.get(i).getConsultedDoctor());
					System.out.println(woi.get(i).getDoctorId());
				}

			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public void displayDischargeSummary(int id) {
		List<Patient> woi = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream("G:\\hospitalfiles\\Patient.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			woi = (ArrayList<Patient>) ois.readObject();

			for (int i = 0; i < woi.size(); i++) {
				if (id == woi.get(i).getPatientId()) {
					System.out.println("\n\n");
					System.out.println(woi.get(i).getPatientId());
					System.out.println(woi.get(i).getName());
					System.out.println(woi.get(i).getAddress());
					System.out.println(woi.get(i).getAge());
					System.out.println(woi.get(i).getBloodGroup());
					System.out.println(woi.get(i).getDisease());
					System.out.println(woi.get(i).getGender());
					System.out.println(woi.get(i).getPhoneNumber());
					System.out.println(woi.get(i).getSymptoms());
					System.out.println(woi.get(i).getMedicines());
					System.out.println(woi.get(i).getConsultedDoctor());
					System.out.println(woi.get(i).getDoctorId());
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
