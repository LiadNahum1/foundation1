import junit.framework.TestCase;
import main.Bridge;
import main.Driver;

import java.util.HashMap;
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
    public boolean updateProject(int projectID, HashMap<String,String> valueToField) {
        return bridge.updateProject(projectID, valueToField);
    }

    public int signProject(String studentId, List<String> ids, String nameMentor){
        return bridge.signProject(studentId, ids, nameMentor);
    }
}

