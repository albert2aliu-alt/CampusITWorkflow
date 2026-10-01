package edu.university.campus;

import edu.university.campus.domain.StudentTechnician;
import edu.university.campus.domain.SystemAdministrator;

public class Application {

    public static void main(String[] args) {

        StudentTechnician technician = new StudentTechnician(
                101,
                "Alex",
                "alex@university.edu",
                "Network Support"
        );

        SystemAdministrator administrator = new SystemAdministrator(
                201,
                "Maria",
                "maria@university.edu",
                "FULL"
        );

        System.out.println("Student Technician:");
        System.out.println(technician.getName());
        System.out.println(technician.getSpecialization());

        System.out.println();

        System.out.println("System Administrator:");
        System.out.println(administrator.getName());
        System.out.println(administrator.getAccessLevel());

        System.out.println();

        technician.processRequest();
        administrator.processRequest();
    }
}
