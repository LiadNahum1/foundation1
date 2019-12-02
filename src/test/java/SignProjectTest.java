import org.junit.*;

import java.util.LinkedList;
import java.util.List;

public class SignProjectTest extends ProjectTest {

    @Test
    public void testSignProject()
    {
        String studentId = "318841285";
        List<String> ids = new LinkedList<String>();
        ids.add("207912734");
        ids.add("111111111");
        ids.add("123456789");

        String nameMentor = "Mentor";
        //test1 - all details are legal and all students are not signed to other project
        assertNotSame(signProject(studentId, ids, nameMentor), -1);

        /* all details are legal and all students are not signed to other project but
        this time there are only 3 participants */
        studentId = "222222222";
        ids.clear();
        ids.add("333333333");
        ids.add("444444444");
        assertNotSame(signProject(studentId, ids, nameMentor), -1);

        //test2 - mentor "Mentor" is already mentor 4 projects
        studentId = "987654321";
        ids.clear();
        ids.add("121212121");
        ids.add("232323232");
        ids.add("343434343");
        signProject(studentId, ids, nameMentor);

        studentId = "987654322";
        ids.clear();
        ids.add("121212122");
        ids.add("232323233");
        ids.add("343434344");
        signProject(studentId, ids, nameMentor);

        //four projects has signed to mentor "mentor" till now and this one will be the fifth
        studentId = "565656565";
        ids.clear();
        ids.add("111111112");
        ids.add("111111113");
        ids.add("111111114");
        assertSame(signProject(studentId, ids, nameMentor), -1);

        //test3 - student 565656565 already signed to another project
        ids.clear();
        ids.add("222222223");
        ids.add("222222224");
        ids.add("222222225");
        nameMentor = "Mentor2";
        assertSame(signProject(studentId, ids, nameMentor), -1);

        //test4 - too short id
        studentId = "207912444";
        ids.clear();
        ids.add("123213");
        ids.add("111111222");
        ids.add("123456788");
        nameMentor = "MentorB";
        assertSame(signProject(studentId,ids,nameMentor),-1);

        //test5 - illegal mates id
        studentId = "207912555";
        ids.clear();
        ids.add("djfh56788");
        ids.add("123123129");
        ids.add("123123789");
        nameMentor = "MentorC";
        assertSame(signProject(studentId,ids,nameMentor),-1);

        //test6 - ids list is longer than 3
        studentId = "565644444";
        ids.clear();
        ids.add("444111112");
        ids.add("114441113");
        ids.add("441111114");
        ids.add("441111115");
        nameMentor = "MentorD";
        assertSame(signProject(studentId,ids,nameMentor),-1);
    }
}
