package person;

import org.junit.*;

import static junit.framework.Assert.*;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: Lukasz
 * Date: 18/01/2013
 */
public class PersonTest {

    private Person p;
    private static int counter = 0;

    @BeforeClass
    public static void beforeClass() throws Exception
    {
        System.out.println( "Class " + " test starts");
    }

    @AfterClass
    public static void afterClass() throws Exception{
        System.out.println( " Class " + " test finished");
    }

    @Before
    public void setUp() throws Exception
    {
        p = new Person();
    }

    @After
    public void afterEachTest()
    {
        System.out.println( "Test " + ++counter + " completed");
    }

    @Test( timeout = 1 )
    public void testGetName() throws Exception
    {
        assertEquals("Default", p.getM_name());
    }

    @org.junit.Test
    public void testGetId() throws Exception {
        assertEquals( 0, p.getM_id() );
    }

    @org.junit.Test
    public void testGetEmail() throws Exception {
        assertEquals( "email@dot.com", p.getM_email());
    }

    @org.junit.Test
    public void testSetName() throws Exception {
        p.setM_name("Nikki");
        assertEquals( "Nikki", p.getM_name());
    }

    @org.junit.Test
    public void testSetId() throws Exception {
        p.setM_id(727173);
        assertEquals( 727173, p.getM_id());
    }

    @org.junit.Test
    public void testSetEmail() throws Exception {
        p.setM_email( "myemail@mail.com" );
        assertEquals( "myemail@mail.com", p.getM_email());
    }

    @org.junit.Test
    public void testEquals() throws Exception {
        Person p1 = new Person();
        assertEquals( p, p1);
    }

    @org.junit.Test
    public void testHashCode() throws Exception {

    }

    @org.junit.Test
    public void testToString() throws Exception {
        System.out.println( p );
    }
}
