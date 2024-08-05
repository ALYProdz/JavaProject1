//import javax.naming.Name;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//import java.util.stream.Collectors;
/* Create the employee public class to process
*
* */
public class EmployeeProcessing {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Wedson", 27, "RD", 23000),
                new Employee("Jamesen", 35, "Engineering", 56000),
                new Employee("Peter", 40, "Marketing", 59000),
                new Employee("Edouard", 32, "Finance", 79000)
        );

        // Function to concatenate name and department
        Function<Employee, String> concatNameAndDept = employee -> employee.name + " - " + employee.department;

        // Generate a new collection with concatenated strings
        List<String> concatenatedNamesAndDepts = employees.stream()
                .map(concatNameAndDept)
                .toList();

        System.out.println("Concatenated Names and Departments:");
        concatenatedNamesAndDepts.forEach(System.out::println);

        // Calculate average salary
        double averageSalary = employees.stream()
                .mapToDouble(employee -> employee.salary)
                .average()
                .orElse(0);

        System.out.println("Average Salary: " + averageSalary);

        // Filter employees based on age threshold (e.g., 30 years)
        int ageThreshold = 30;
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.age > ageThreshold)
                .toList();

        System.out.println("Employees above " + ageThreshold + " years old:");
        filteredEmployees.forEach(employee -> System.out.println(employee.name));
        

    }
}
