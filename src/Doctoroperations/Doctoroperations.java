package Doctoroperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import Patientbean.Patient;
import Doctornotes.Doctornotes;

public class Doctoroperations {
	List<Patient> listOfPatient = new ArrayList<Patient>();
	List<Doctornotes> listOfNotes = new ArrayList<Doctornotes>();

	Scanner s = new Scanner(System.in);
	Scanner i = new Scanner(System.in);
	File file = new File("G:\\hospitalfiles\\Patient.txt");

	public void addPatient(int numberOfPatients) {
		int count = 0;
		while (count < numberOfPatients) // Number of patients are read and loop is run based on that
		{

			Patient p = new Patient();
			System.out.println("Enter the identification number of the patient: ");
			p.setPatientId(s.nextInt());
			System.out.println("Enter the name of the patient: ");
			p.setName(s.next());
			System.out.println("Enter the address of the patient:");
			p.setAddress(s.next());
			System.out.println("Enter the age of the  patient: ");
			p.setAge(i.nextInt());
			System.out.println("Enter the blood group of the patient: ");
			p.setBloodGroup(s.next());
			System.out.println("Enter the disease of the patient: ");
			p.setDisease(s.next());
			System.out.println("Enter the gender of the patient: ");
			p.setGender(s.next());
			System.out.println("Enter the phone number of the new patient:");
			p.setPhoneNumber(i.nextInt());
			System.out.println("Enter the initial symptoms of the patient: ");
			p.setSymptoms(s.next());
			System.out.println("Enter the medicines of the patient: ");
			p.setMedicines(s.next());
			System.out.println("Enter the name of the Consulted Doctor: ");
			p.setConsultedDoctor(s.next());
			System.out.println("Enter the id of the Consulted Doctor:");
			p.setDoctorId(i.nextInt());
			listOfPatient.add(p); // An array list is created and object is pushed one by one
			count++;

		}

		try (FileOutputStream ops = new FileOutputStream(file); ObjectOutputStream objOps = new ObjectOutputStream(ops)) // To
																															// eliminate
																															// finally
																															// block
		{

			objOps.writeObject(listOfPatient);
			objOps.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nPatient data inserted successfully");
	}

	@SuppressWarnings("unchecked")
	public void displayPatient() {
		List<Patient> woi = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream("G:\\hospitalfiles\\Patient.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			woi = (ArrayList<Patient>) ois.readObject();

			for (int i = 0; i < woi.size(); i++) // The objects are read one by one from the array list
			{

				System.out.println("\n\n");

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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public void viewPrescriptions() {

		List<Patient> woi = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream("G:\\hospitalfiles\\Patient.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			woi = (ArrayList<Patient>) ois.readObject();
			for (int i = 0; i < woi.size(); i++) {
				System.out.println("\n\n");
				System.out.println(woi.get(i).getPatientId());
				System.out.println(woi.get(i).getName());
				System.out.println(woi.get(i).getMedicines());
				System.out.println(woi.get(i).getConsultedDoctor());
				System.out.println(woi.get(i).getDoctorId());

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

	public void addDoctorNotes(int number) {
		int count = 0;
		while (count < number) {
			Doctornotes dn = new Doctornotes(); // Object of Bean class Doctornotes is created
			System.out.println("Enter the identification number of the Doctor: ");
			dn.setDoctorId(i.nextInt());
			System.out.println("Enter the name of the Doctor: ");
			dn.setDoctorName(s.next());
			System.out.println("Enter the identification number of the Patient: ");
			dn.setPatientId(i.nextInt());
			System.out.println("Enter the name of the Patient: ");
			dn.setPatientName(s.next());
			System.out.println("Enter the Doctor notes ");
			dn.setDoctorNotes(s.next());
			count++;
			listOfNotes.add(dn);
		}
		try (FileOutputStream ops = new FileOutputStream(new File("G:\\hospitalfiles\\Doctornotes.txt"));
				ObjectOutputStream objOps = new ObjectOutputStream(ops)) {

			objOps.writeObject(listOfNotes);
			objOps.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nDoctor notes inserted successfully");

	}

	@SuppressWarnings("unchecked")
	public void viewDoctorNotes() {
		List<Doctornotes> woi = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream("G:\\hospitalfiles\\Doctornotes.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			woi = (ArrayList<Doctornotes>) ois.readObject();
			for (int i = 0; i < woi.size(); i++) {
				System.out.println("\n\n");
				System.out.println(woi.get(i).getDoctorId());
				System.out.println(woi.get(i).getDoctorName());
				System.out.println(woi.get(i).getPatientId());
				System.out.println(woi.get(i).getPatientName());
				System.out.println(woi.get(i).getDoctorNotes());

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

}
