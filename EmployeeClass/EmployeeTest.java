package FirstSetOfTddPractice.EmployeeClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class EmployeeTest {
    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }
}