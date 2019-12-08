package main;

import junit.framework.TestCase;
import java.util.List;

public class ProjectTest extends TestCase {
    protected Bridge bridge;

    protected void setUp() throws Exception {
        super.setUp();
        this.bridge = Driver.getBridge();
    }

    public int addProject(String projectName, String description, int hours, String firstName, String lastName, String email, String phone, String organization) {
        return bridge.addProject(projectName, description, hours, firstName, lastName, email, phone, organization);
    }
    public boolean deleteProject(int projectID){
        return bridge.deleteProject(projectID);
    }
    public int signProject(String studentId, List<String> ids, String nameMentor){
        return bridge.signProject(studentId, ids, nameMentor);
    }

    public boolean unsignProject(int projectID)
    {
        return bridge.unsignProject(projectID);
    }
}

