package com.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.unittest.bangunruang.Segitiga;

public class TestingSegitiga {
	Segitiga segitiga;

	@Before
	public void setUp() throws Exception {
		segitiga = new Segitiga();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLuasSegitiga() {
		assertEquals(6071.0, segitiga.LuasSegitiga(934.0, 13.0),0.0);
	}

}
