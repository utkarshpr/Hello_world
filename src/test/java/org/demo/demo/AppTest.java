package org.demo.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App a=new App();
		assertEquals(a.test(),"Hello world");
	}

}
