package com.example.demo.payroll;



import com.example.demo.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Override
    Page<Employee> findAll(Pageable pageable);
}