package main;

import java.util.List;

public interface Bridge {
    int addProject(String projectName, String description, int hours, String firstName, String lastName, String email, String phone, String organization);
    boolean deleteProject(int projectID);
    int signProject(String studentId, List<String> ids, String nameMentor);
    boolean unsignProject(int projectID); //delete signing to project
}
