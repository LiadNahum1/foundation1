package main;
import org.junit.*;


public class AddProjectTest extends ProjectTest {

    @Test
    public void testAddProject()
    {
        int projectID = addProject("project1", "First project", 100, "professor", "professor", "prof@post.bgu.ac.il"
                , "0526144485", "google");
        assertNotSame(projectID, -1); //adding project successfully
        deleteProject(projectID);

        //adding projects fails
        assertSame(addProject("project2", "", 80, "professor", "professor", "prof@post.bgu.ac.il"
                , "0526144485", "IBM"), -1); //description is missing
        assertSame(addProject("project3", "Third project", 50, "professor", "professor", "prof@post.bgu.ac.il"
                , "05261444ab", "BGU University"), -1); //illegal phone number
        assertSame(addProject("project4", "Fourth project", -1, "professor", "professor", "prof@post.bgu.ac.il"
                , "0521111111", "BGU University"), -1); //illegal hour - negative number

    }
}
