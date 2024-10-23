package demo.service;

import demo.model.EmployeeOnetoOne;
import demo.model.EmployeeDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public EmployeeDetails getEmployeeDetailsById(int id) {
        return entityManager.find(EmployeeDetails.class, id);
    }

    @Transactional
    public EmployeeOnetoOne getEmployeeById(int id) {
        return entityManager.find(EmployeeOnetoOne.class, id);
    }

    @Transactional
    public List<EmployeeDetails> getAllEmployees() {
        return entityManager.createQuery("FROM EmployeeDetails", EmployeeDetails.class).getResultList();
    }

    @Transactional
    public EmployeeOnetoOne saveEmployee(EmployeeOnetoOne employeeOnetoOne) {
        entityManager.persist(employeeOnetoOne);
        return employeeOnetoOne;
    }

    @Transactional
    public EmployeeDetails saveEmployeeDetails(EmployeeDetails details) {
        entityManager.persist(details);
        return details;
    }

    @Transactional
    public void deleteEmployeeById(int id) {
        EmployeeOnetoOne employeeOnetoOne = getEmployeeById(id);
        if (employeeOnetoOne != null) {
            entityManager.remove(employeeOnetoOne);
        }
    }
}
