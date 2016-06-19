package junittest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		add at=new add();
		int result= at.addition(10, 6);
		assertEquals(result,12);
		
	}

}
