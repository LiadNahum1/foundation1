package main;

import java.util.List;

public class RealBridge implements Bridge {
    public boolean addProject(String projectName, String description, int hours, String firstName, String lastName, String email, String phone, String organization) {
        return false;
    }

    public boolean signProject(String studentId, List<String> ids, String nameMentor) {
        return false;
    }
}
