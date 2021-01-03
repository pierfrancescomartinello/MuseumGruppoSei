<<<<<<< Updated upstream
package museumUtil;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateHandlerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void LocalDateCreatorTest() {
		//Red Phase
		//assertTrue(false);
		
		//Green Phase
		assertEquals(LocalDate.of(2021, Month.JANUARY, 1), Utilities.LocalDateCreator(1, Month.JANUARY, 2021));
		assertEquals("02 - Feb - 2002", Utilities.LocalDatePrinter(Utilities.LocalDateCreator(2, Month.FEBRUARY, 2002), "-"));
	}
	

}
=======
package museumUtil;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.GruppoSei.code.museumUtil.Utilities;

class DateHandlerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void LocalDateCreatorTest() {
		//Red Phase
		//assertTrue(false);
		
		//Green Phase
		assertEquals(LocalDate.of(2021, Month.JANUARY, 1), Utilities.LocalDateCreator(1, Month.JANUARY, 2021));
		assertEquals("02 - Feb - 2002", Utilities.LocalDatePrinter(Utilities.LocalDateCreator(2, Month.FEBRUARY, 2002), "-"));
	}
	

}
>>>>>>> Stashed changes
