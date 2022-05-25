package net.javaguides.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.mockito.Mockito.when;

@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    // JUnit test for saveEmployee
    @Test
    public void saveEmployeeTest() {
        Employee employee = Employee.builder()
                .firstName("Korir")
                .lastName("Laboso")
                .email("laboso@gmail.com")
                .build();

        employeeRepository.save(employee);

//        when(employeeRepository.save(employee)).thenReturn(employee);
//        Assertions.assertEquals(employee, );

        Assertions.assertThat(employee.getId()).isGreaterThan(0);
    }

}
