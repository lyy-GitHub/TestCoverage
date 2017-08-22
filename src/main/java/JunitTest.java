import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;


public class JunitTest {

	@Test
	public void test() {
		int b=YTest.TestAdd(5,20);		
		Assert.assertEquals(b,50);
	}

}
