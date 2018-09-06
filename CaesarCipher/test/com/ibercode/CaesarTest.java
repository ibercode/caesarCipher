package com.ibercode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarTest {

	@Test
	void encryptTest() {
		Caesar caesar = new Caesar(3);
		String encrypted = caesar.encrypt("HELLO");
		assertEquals("KHOOR", encrypted);
	}

	@Test
	void decryptTest() {
		Caesar caesar = new Caesar(3);
		String encrypted = caesar.dencrypt("KHOOR");
		assertEquals("HELLO", encrypted);
	}
}
