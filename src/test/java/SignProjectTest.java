import junit.framework.TestCase;
import main.Bridge;
import main.Driver;
import main.ProxyBridge;
import org.junit.*;

import java.util.LinkedList;
import java.util.List;

public class SignProjectTest extends TestCase {
    private Bridge bridge = new ProxyBridge();

    protected void setUp() throws Exception{
        super.setUp();
        this.bridge = Driver.getBridge();
    }

    @Test
    void testSignProject()
    {
        String studentId = "318841285";
        List<String> ids = new LinkedList<String>();
        ids.add("207912734");
        ids.add("1111111");
        ids.add("1234567");
        String nameMentor = "Mentor";
        assertTrue(bridge.signProject(studentId, ids, nameMentor));

        ids.add("1111111");
        assertFalse(bridge.signProject(studentId, ids, nameMentor));

        ids.add("1234567");
        assertFalse(bridge.signProject(studentId, ids, nameMentor));


    }


}
