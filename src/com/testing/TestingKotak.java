package com.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.unittest.bangunruang.Kotak;

public class TestingKotak {
	Kotak kotak;

	@Before
	public void setUp() throws Exception {
		kotak = new Kotak();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLuasKotak() {
		assertEquals(6724.0, kotak.LuasKotak(82.0),0.0);
	}

}
