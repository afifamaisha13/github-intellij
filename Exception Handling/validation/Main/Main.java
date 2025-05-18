package validation.Main;

import validation.check.Test;
import validation.exception.InvalidAgeException;
import validation.exception.InvalidDepartmentException;

public class Main {
    public static void main(String[] args) {
        try {
            Test.validateAge(20);           // Try 12 to trigger age exception
            Test.validateDepartment("HR");  // Try "ICT" to make it valid
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught Age Exception: " + e.getMessage());
        }
        catch (InvalidDepartmentException e) {
            System.out.println("Caught Department Exception: " + e.getMessage());
        }
        finally {
            System.out.println("End of validation. This runs no matter what.");
        }
    }
}


