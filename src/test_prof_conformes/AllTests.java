package test_prof_conformes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//import tests_prof.CarteTest;

@RunWith(Suite.class)
@SuiteClasses({ CarteConformeTest.class, PaquetDeCartesConformeTest.class, PileConformeTest.class,
		PiocheConformeTest.class})
public class AllTests {

	@AfterClass
	public static void autre() {
		//new CarteTest();
	}

}
