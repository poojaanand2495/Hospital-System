package Controller;

import Doctoroperations.Doctoroperations;
import Patientoperations.Patientoperations;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		int choice1 = 0, choice2 = 0, choice3 = 0, numberOfPatients;
		Doctoroperations d = new Doctoroperations();
		Patientoperations po = new Patientoperations();
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM...................... ");
			System.out.println("Are you a \n  1.Doctor \n 2.Patient\n Enter your choice(1 or 2)  : ");
			choice1 = s.nextInt();
			switch (choice1) {
			case 1:
				System.out.println(
						" WELCOME DOCTOR....\nPLEASE CHOOSE WHAT YOU WANT TO DO \n 1. Add patients \n2.View all Patients\n 3.view all Prescriptions \n4.Create Doctor notes \n5.View Doctor notes....PLEASE ENTER YOUR CHOICE :");
				choice2 = s.nextInt();
				switch (choice2) {
				case 1:
					System.out.println("Enter the number of patients");
					numberOfPatients = s.nextInt();
					d.addPatient(numberOfPatients);
					break;
				case 2:
					d.displayPatient();
					break;

				case 3:
					d.viewPrescriptions();
					break;
				case 4:
					System.out.println("Enter the number of patients");
					int numberOfNotes = s.nextInt();
					d.addDoctorNotes(numberOfNotes);
					break;
				case 5:
					d.viewDoctorNotes();
					break;
				}
				break;
			case 2:
				System.out.println(
						" WELCOME PATIENT..........\nPLEASE CHOOSE WHAT YOU WANT TO DO \n 1. VIEW PRESCRIPTION \n2.VIEW DISCHARGE SUMMARY .....PLEASE ENTER YOUR CHOICE(1/2 ) :");
				choice2 = s.nextInt();
				switch (choice2) {
				case 1:
					System.out.println("Enter your ID");
					int id = s.nextInt();
					po.viewPrescription(id);
					break;
				case 2:
					System.out.println("Enter your ID");
					id = s.nextInt();
					po.displayDischargeSummary(id);
					break;
				}
				break;

			}

			System.out.println("Press 3 to continue the process");
			choice3 = s.nextInt();

			System.out.println("\n");
		} while (choice3 == 3);
		s.close();
	}

}