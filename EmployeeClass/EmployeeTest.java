package FirstSetOfTddPractice.EmployeeClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void testThatEmployeeFirstNameCanBeGotten(){
        employee.setFirstName("Tony");
        assertEquals("Tony", employee.getFirstName());
    }

    @Test
    void testThatEmployeeLastNameCanBeGotten(){
        employee.setLastName("Starks");
        assertEquals("Starks", employee.getLastName());
    }

    @Test
    void testThatEmployeeMonthlySalaryCanBeCalculated(){
        employee.calculateMonthlySalary(1000);
        assertEquals(1000,employee.getMonthlySalary());
    }

    @Test
    void testThatEmployeeYearlySalaryCanBeCalculated(){
        double monthlySalary = 1000;
        employee.calculateYearlySalary(monthlySalary);
        assertEquals(12000, employee.getYearlySalary());
    }

//    @Test
//    void testThatEmployeeYearlyPercentIncreaseCanBeCalculated(){
//        employee.calculateYearlyPercentIncrease()
//    }

}
