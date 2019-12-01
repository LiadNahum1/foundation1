import junit.framework.TestCase;
import main.Bridge;
import main.Driver;
import main.ProxyBridge;
import org.junit.*;

import java.util.HashMap;

public class AddProjectTest extends TestCase {
    private Bridge bridge;

    protected void setUp() throws Exception{
        super.setUp();
        this.bridge = Driver.getBridge();
    }

    @Test
    void addProjectTest()
    {
        assertNotSame(bridge.addProject("project1", "First project", 100, "professor", "professor", "prof@post.bgu.ac.il"
                , "0526144485", "google"), -1);
        assertSame(bridge.addProject("project2", "", 80, "professor", "professor", "prof@post.bgu.ac.il"
                , "0526144485", ""), -1); //description and organization are missing
    }

    @Test
    void updateProjectTest()
    {
        //add project
        int projectID = bridge.addProject("project", "Project for update", 90, "professor", "professor", "prof@post.bgu.ac.il"
            , "0526144485", "BGU university");
        HashMap<String, String> valueToField = new HashMap<String, String>();
        valueToField.put("phone", "054222722");
        valueToField.put("description", "More details about the project");
        assertTrue(bridge.updateProject(projectID, valueToField ));
        assertFalse(bridge.updateProject(-1,valueToField));
    }


}
