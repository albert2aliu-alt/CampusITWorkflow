package edu.university.campus.domain;

public class StudentTechnician extends User {

    private String specialization;

    public StudentTechnician(
            int id,
            String name,
            String email,
            String specialization) {

        super(id, name, email);
        setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.isBlank()) {
            throw new IllegalArgumentException(
                    "Specialization cannot be empty."
            );
        }

        this.specialization = specialization;
    }

    @Override
    public void processRequest() {
        System.out.println(
                getName() + " is processing the request as a student technician."
        );
    }
}
