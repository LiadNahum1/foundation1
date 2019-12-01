package main;

import java.util.HashMap;
import java.util.List;

public interface Bridge {
    int addProject(String projectName, String description, int hours, String firstName, String lastName, String email, String phone, String organization);

    int signProject(String studentId, List<String> ids, String nameMentor);

    boolean updateProject(int projectID, HashMap<String, String> valueToField);
}
