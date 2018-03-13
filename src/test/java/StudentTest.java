import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class StudentTest {

	Student s;
	
	@Before
	public void setup() {
		s = new Student("Joe Gaucho",123456,"CMPSC");
	}
	
    @Test
    public void test_getName() {
		assertEquals("Joe Gaucho",s.getName());
    }
	
	@Test
    public void test_getPerm() {
		assertEquals(123456,s.getPerm());
    }

	@Test
    public void test_getMajor() {
		assertEquals("CMPSC",s.getMajor());
    }

	
}
