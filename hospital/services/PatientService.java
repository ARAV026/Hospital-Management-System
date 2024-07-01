package com.hospital.services;

import com.hospital.models.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
	 private List<Patient> patients;

	    public PatientService() {
	        patients = new ArrayList<>();
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    public List<Patient> getAllPatients() {
	        return patients;
	    }

	    public Patient getPatientById(String id) {
	        for (Patient patient : patients) {
	            if (patient.getId().equals(id)) {
	                return patient;
	            }
	        }
	        return null;
	    }

	    public void updatePatient(Patient updatedPatient) {
	        for (Patient patient : patients) {
	            if (patient.getId().equals(updatedPatient.getId())) {
	                patient.setName(updatedPatient.getName());
	                patient.setAge(updatedPatient.getAge());
	                patient.setGender(updatedPatient.getGender());
	                patient.setDiagnosis(updatedPatient.getDiagnosis());
	            }
	        }
	    }

	    public void deletePatient(String id) {
	        patients.removeIf(patient -> patient.getId().equals(id));
	    }

}
