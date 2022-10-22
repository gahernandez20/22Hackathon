package prob3;

public class PersonHandlerTest {

	public void testPrintReporttxt() {
		Person p = new Person("Stevo", 69);
		PersonHandler ph = new PersonHandler();
		ph.addPerson(p);
	}
}
