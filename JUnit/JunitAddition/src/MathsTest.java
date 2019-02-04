import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MathsTest {

	Maths m= new Maths();
	@Test
	public void TestAddition() {
		assertEquals(8, m.addition(4,4));
	}
	void test() {
		fail("Not yet implemented");
	}

}
