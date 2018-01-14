import java.util.ArrayList;
import java.util.List;

public class Comcats1 {
	public static void main(String[] args) {
		/*
		 * Integer a = new Integer(1); Set<Integer> numbers = new HashSet<>();
		 * numbers.add(4);
		 * 
		 * numbers.add(3); numbers.add(4); numbers.add(5); numbers.add(new
		 * Integer(6)); numbers.add(a);
		 * 
		 * List sortedList = new ArrayList(numbers);
		 * Collections.sort(sortedList, Collections.reverseOrder());
		 * System.out.println(sortedList);
		 */

		// 2

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Paul"));
		employees.add(new Employee("John"));
		employees.add(new Employee("George"));
		employees.add(new Employee("Ringo"));

		for (Employee e : employees) {
			if (e.getName() == "John") {

			//employees.remove(e);
			System.out.println(e);

			}
			

		}
		
	}
}
