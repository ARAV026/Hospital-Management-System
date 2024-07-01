package com.hospital;

import com.hospital.models.Patient;
import com.hospital.models.Doctor;
import com.hospital.services.PatientService;
import com.hospital.services.DoctorServices;
import com.hospital.util.InputUtil;

public class Main {
	private static PatientService patientService = new PatientService();
    private static DoctorServices doctorService = new DoctorServices();

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            int choice = getValidChoice();
            switch (choice) {
                case 1:
                    managePatients();
                    break;
                case 2:
                    manageDoctors();
                    break;
                case 3:
                    InputUtil.closeScanner();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("Hospital Management System");
        System.out.println("1. Manage Patients");
        System.out.println("2. Manage Doctors");
        System.out.println("3. Exit");
    }

    private static int getValidChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(InputUtil.getString("Enter your choice: "));
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    private static void managePatients() {
        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Find Patient by ID");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Back to Main Menu");
            int choice = getValidChoice();
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewAllPatients();
                    break;
                case 3:
                    findPatientById();
                    break;
                case 4:
                    updatePatient();
                    break;
                case 5:
                    deletePatient();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addPatient() {
        String id = InputUtil.getString("Enter patient ID: ");
        String name = InputUtil.getString("Enter patient name: ");
        int age = InputUtil.getInt("Enter patient age: ");
        String gender = InputUtil.getString("Enter patient gender: ");
        String diagnosis = InputUtil.getString("Enter patient diagnosis: ");
        Patient patient = new Patient(id, name, age, gender, diagnosis);
        patientService.addPatient(patient);
        System.out.println("Patient added successfully!");
    }

    private static void viewAllPatients() {
        System.out.println("List of All Patients:");
        for (Patient patient : patientService.getAllPatients()) {
            System.out.println(patient);
        }
    }

    private static void findPatientById() {
        String id = InputUtil.getString("Enter patient ID: ");
        Patient patient = patientService.getPatientById(id);
        if (patient != null) {
            System.out.println(patient);
        } else {
            System.out.println("Patient not found!");
        }
    }

    private static void updatePatient() {
        String id = InputUtil.getString("Enter patient ID to update: ");
        Patient existingPatient = patientService.getPatientById(id);
        if (existingPatient != null) {
            String name = InputUtil.getString("Enter new patient name: ");
            int age = InputUtil.getInt("Enter new patient age: ");
            String gender = InputUtil.getString("Enter new patient gender: ");
            String diagnosis = InputUtil.getString("Enter new patient diagnosis: ");
            existingPatient.setName(name);
            existingPatient.setAge(age);
            existingPatient.setGender(gender);
            existingPatient.setDiagnosis(diagnosis);
            patientService.updatePatient(existingPatient);
            System.out.println("Patient updated successfully!");
        } else {
            System.out.println("Patient not found!");
        }
    }

    private static void deletePatient() {
        String id = InputUtil.getString("Enter patient ID to delete: ");
        patientService.deletePatient(id);
        System.out.println("Patient deleted successfully!");
    }

    private static void manageDoctors() {
        while (true) {
            System.out.println("1. Add Doctor");
            System.out.println("2. View All Doctors");
            System.out.println("3. Find Doctor by ID");
            System.out.println("4. Update Doctor");
            System.out.println("5. Delete Doctor");
            System.out.println("6. Back to Main Menu");
            int choice = getValidChoice();
            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    viewAllDoctors();
                    break;
                case 3:
                    findDoctorById();
                    break;
                case 4:
                    updateDoctor();
                    break;
                case 5:
                    deleteDoctor();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addDoctor() {
        String id = InputUtil.getString("Enter doctor ID: ");
        String name = InputUtil.getString("Enter doctor name: ");
        String specialization = InputUtil.getString("Enter doctor specialization: ");
        String phone = InputUtil.getString("Enter doctor phone: ");
        Doctor doctor = new Doctor(id, name, specialization, phone);
        doctorService.addDoctor(doctor);
        System.out.println("Doctor added successfully!");
    }

    private static void viewAllDoctors() {
        System.out.println("List of All Doctors:");
        for (Doctor doctor : doctorService.getAllDoctors()) {
            System.out.println(doctor);
        }
    }

    private static void findDoctorById() {
        String id = InputUtil.getString("Enter doctor ID: ");
        Doctor doctor = doctorService.getDoctorById(id);
        if (doctor != null) {
            System.out.println(doctor);
        } else {
            System.out.println("Doctor not found!");
        }
    }

    private static void updateDoctor() {
        String id = InputUtil.getString("Enter doctor ID to update: ");
        Doctor existingDoctor = doctorService.getDoctorById(id);
        if (existingDoctor != null) {
            String name = InputUtil.getString("Enter new doctor name: ");
            String specialization = InputUtil.getString("Enter new doctor specialization: ");
            String phone = InputUtil.getString("Enter new doctor phone: ");
            existingDoctor.setName(name);
            existingDoctor.setSpecialization(specialization);
            existingDoctor.setPhone(phone);
            doctorService.updateDoctor(existingDoctor);
            System.out.println("Doctor updated successfully!");
        } else {
            System.out.println("Doctor not found!");
        }
    }

    private static void deleteDoctor() {
        String id = InputUtil.getString("Enter doctor ID to delete: ");
        doctorService.deleteDoctor(id);
        System.out.println("Doctor deleted successfully!");
    }

}
