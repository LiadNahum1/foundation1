import org.junit.*;

import java.util.HashMap;

public class AddProjectTest extends ProjectTest {

    @Test
    void testAddProject()
    {
        assertNotSame(addProject("project1", "First project", 100, "professor", "professor", "prof@post.bgu.ac.il"
                , "0526144485", "google"), -1);
        assertSame(bridge.addProject("project2", "", 80, "professor", "professor", "prof@post.bgu.ac.il"
                , "0526144485", ""), -1); //description and organization are missing
    }

    @Test
    public void testUpdateProject()
    {
        //add project
        int projectID = bridge.addProject("project", "Project for update", 90, "professor", "professor", "prof@post.bgu.ac.il"
            , "0526144485", "BGU university");
        HashMap<String, String> valueToField = new HashMap<String, String>();
        valueToField.put("phone", "054222722");
        valueToField.put("description", "More details about the project");
        assertTrue(updateProject(projectID, valueToField));
        assertFalse(updateProject(-1, valueToField));
    }


}
