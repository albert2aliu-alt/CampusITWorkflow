package edu.university.campus.domain;

public class SystemAdministrator extends User {

    private String accessLevel;

    public SystemAdministrator(
            int id,
            String name,
            String email,
            String accessLevel) {

        super(id, name, email);
        setAccessLevel(accessLevel);
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        if (accessLevel == null || accessLevel.isBlank()) {
            throw new IllegalArgumentException(
                    "Access level cannot be empty."
            );
        }

        this.accessLevel = accessLevel;
    }
    @Override
    public void processRequest() {
        System.out.println(
                getName() + " is processing the request as a system administrator."
        );
    }
}
