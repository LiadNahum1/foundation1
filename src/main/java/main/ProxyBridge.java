package main;

import java.util.HashMap;
import java.util.List;

public class ProxyBridge implements Bridge {
    public Bridge bridge;
    public ProxyBridge(){
        this.bridge = null;
    }

    public int addProject(String projectName, String description, int hours, String firstName, String lastName, String email, String phone, String organization)
    {
        if (this.bridge == null)
            return -1;
        else
            return bridge.addProject(projectName, description, hours, firstName, lastName, email, phone, organization);
    }

    public boolean signProject(String studentId, List<String> ids, String nameMentor) {
        if (this.bridge == null)
            return false;
        else
            return bridge.signProject(studentId, ids, nameMentor);
    }

    public boolean updateProject(int projectID, HashMap<String, String> valueToField) {
        return false;
    }
}

