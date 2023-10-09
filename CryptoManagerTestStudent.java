import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("THIS TEST SHOULD SUCCEED"));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("TPDDFS", CryptoManager.caesarEncryption("SOCCER", 1));
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("DOVGHSZ", CryptoManager.bellasoEncryption("ABCDEFG", "CMSC"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("SOCCER", CryptoManager.caesarDecryption("TPDDFS", 1));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("ABCDEFG", CryptoManager.bellasoDecryption("DOVGHSZ", "CMSC"));
	}

}
