package main;

import java.util.HashMap;
import java.util.List;

public class ProxyBridge implements Bridge {
    public Bridge real;
    public ProxyBridge(){
        this.real = null;
    }

    public boolean updateProject(int projectID, HashMap<String, String> valueToField)
    {
        if(this.real == null)
            return false;
        else
            return real.updateProject(projectID, valueToField);
    }

    public int addProject(String projectName, String description, int hours, String firstName, String lastName, String email, String phone, String organization)
    {
        if (this.real == null)
            return -1;
        else
            return real.addProject(projectName, description, hours, firstName, lastName, email, phone, organization);
    }

    public int signProject(String studentId, List<String> ids, String nameMentor) {
        if (this.real == null)
            return -1;
        else
            return real.signProject(studentId, ids, nameMentor);
    }


}

