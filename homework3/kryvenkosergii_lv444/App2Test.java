package homework3.kryvenkosergii_lv444;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class App2Test {

	@Test // test class App2 - name and the kind of the oldest dog
	void testChecOldestDog() {
		String actualName = "Jerry";
		int actualAge = 20;
		App2.check("Danny", "breed1", 10, "Jerry", "breed2", 20, "Luci", "breed3", 8);
		assertSame(actualName, App2.nameOldestDog);
		assertEquals(actualAge, App2.ageOldestDog);
	}

	@Test // checking Enum name of breed
	public void testEnumNameOfBreed() {
		String actualDalmatian = "Dalmatian";
		assertSame(actualDalmatian, Breed.Dalmatian.getNameBreed());
	}

}
