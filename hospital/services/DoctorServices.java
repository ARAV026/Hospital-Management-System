package com.hospital.services;

import com.hospital.models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorServices {
	private List<Doctor> doctors;

    public DoctorServices() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctors);
    }

    public Doctor getDoctorById(String id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }

    public void updateDoctor(Doctor updatedDoctor) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(updatedDoctor.getId())) {
                doctor.setName(updatedDoctor.getName());
                doctor.setSpecialization(updatedDoctor.getSpecialization());
                doctor.setPhone(updatedDoctor.getPhone());
                break;
            }
        }
    }

    public void deleteDoctor(String id) {
        doctors.removeIf(doctor -> doctor.getId().equals(id));
    }


}
