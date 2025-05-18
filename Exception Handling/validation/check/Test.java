package validation.check;

import validation.exception.InvalidAgeException;
import validation.exception.InvalidDepartmentException;


public class Test {

    // Method to validate age
    public static void validateAge(int age)
            throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    // Method to validate department
    public static void validateDepartment(String dept)
            throws InvalidDepartmentException {
        if (!dept.equalsIgnoreCase("ICT")) {
            throw new InvalidDepartmentException("Only ICT department is allowed.");
        }
        System.out.println("Valid department: " + dept);
    }
}
