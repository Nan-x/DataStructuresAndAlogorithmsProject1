import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BedTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
    Bed b = new Bed(1,"fhgf", "uhdk", 2.2, null);
    
	@Test
	public void testBed() {
		assertEquals(1, b.bedRefNumber);
	}

}
