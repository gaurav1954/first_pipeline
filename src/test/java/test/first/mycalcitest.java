package test.first;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg2.firsttest;

public class mycalcitest {

	@Test
	public void test() {
		firsttest obj=new firsttest();
		assertEquals(25,obj.sum(10,15));
	}

}
