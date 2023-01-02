
/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author SeyedehTahereh Houlari
 * @version 1.0
 * @since 11
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	


	public static void main(String[] args) {

		System.out.println("EvenSchedule1");
		EventSchedule firstEvent= new EventSchedule();
		System.out.println(firstEvent.createReport());
		
		System.out.println("EvenSchedule2");
		EventSchedule secondEvent= new EventSchedule(2023);
		System.out.println(secondEvent.createReport());
		
		System.out.println("EvenSchedule3");
		EventSchedule thirdEvent= new EventSchedule(2023,12);
		System.out.println(thirdEvent.createReport());
		
		System.out.println("EvenSchedule4");
		EventSchedule forthEvent= new EventSchedule(2023,12,15);
		System.out.println(forthEvent.createReport());
		

	}

}
